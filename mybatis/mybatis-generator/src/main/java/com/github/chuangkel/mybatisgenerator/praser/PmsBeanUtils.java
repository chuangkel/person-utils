package com.github.chuangkel.mybatisgenerator.praser;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.FatalBeanException;
import org.springframework.util.Assert;
import org.springframework.util.ClassUtils;

import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @program: pms2.0_analyze
 * @description: 数字小数点 统一处理
 * @author: chuangkel
 * @create: 2019-05-13 13:35
 **/
public class PmsBeanUtils extends BeanUtils {

    private final static Map<String, Integer> map = new HashMap<>();

    static {
        map.put("shareRatio", 2);
        map.put("holdingAmount", 4);//持有份额
        map.put("assetProportion", 2);
        map.put("riseFallRatio", 2);
        map.put("overBaseRatio", 2);//超配比例
        map.put("benchmarkProportion", 2);
        map.put("shareRatio", 2);//份额占比
        map.put("dealAmount", 2);//成交数量
        map.put("dealBalance", 2);//成交金额
        map.put("dealAvgPrice", 2);//成交均价
        map.put("closingPrice", 2);//当日收盘价
        map.put("todayProfit", 2);//当日实现收益
        map.put("marketDealPercent", 2);//市场成交量占比
        map.put("assetProportion", 2);//资产占比
    }

    /**
     * 个性化Bean转换工具
     *
     * @param source
     * @param target
     */
    public static void pmsCopyProperties(Object source, Object target) {
        copyProperties(source, target, null, null);
    }

    /**
     * 拷贝的方法，修改了：属性值需要精度处理的，在该方法尾处理
     */
    private static void copyProperties(Object source, Object target, Class<?> editable, String... ignoreProperties)
            throws BeansException {

        Assert.notNull(source, "Source must not be null");
        Assert.notNull(target, "Target must not be null");

        Class<?> actualEditable = target.getClass();
        if (editable != null) {
            if (!editable.isInstance(target)) {
                throw new IllegalArgumentException("Target class [" + target.getClass().getName() +
                        "] not assignable to Editable class [" + editable.getName() + "]");
            }
            actualEditable = editable;
        }
        PropertyDescriptor[] targetPds = getPropertyDescriptors(actualEditable);
        List<String> ignoreList = (ignoreProperties != null ? Arrays.asList(ignoreProperties) : null);

        for (PropertyDescriptor targetPd : targetPds) {
            Method writeMethod = targetPd.getWriteMethod();
            if (writeMethod != null && (ignoreList == null || !ignoreList.contains(targetPd.getName()))) {
                PropertyDescriptor sourcePd = getPropertyDescriptor(source.getClass(), targetPd.getName());
                if (sourcePd != null) {
                    Method readMethod = sourcePd.getReadMethod();
                    if (readMethod != null &&
                            ClassUtils.isAssignable(writeMethod.getParameterTypes()[0], readMethod.getReturnType())) {
                        try {
                            if (!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())) {
                                readMethod.setAccessible(true);
                            }
                            Object value = readMethod.invoke(source);
                            if (!Modifier.isPublic(writeMethod.getDeclaringClass().getModifiers())) {
                                writeMethod.setAccessible(true);
                            }

                            //统一处理数字精度
                            if (map.containsKey(targetPd.getName())) {
                                if (targetPd.getPropertyType() == BigDecimal.class) {
                                    BigDecimal bigDecimal = (BigDecimal) value;
                                    DecimalFormat df = null;
                                    int pos = (int) Math.pow(10, map.get(targetPd.getName()));
                                    df = new DecimalFormat("#." + String.valueOf(pos).substring(1));
                                    StringBuffer sb = df.format(bigDecimal, new StringBuffer(), new FieldPosition(1));
                                    value = new BigDecimal(sb.toString());
                                }
                            }

                            writeMethod.invoke(target, value);
                        } catch (Throwable ex) {
                            throw new FatalBeanException(
                                    "Could not copy property '" + targetPd.getName() + "' from source to target", ex);
                        }
                    }
                }
            }
        }
    }
}
