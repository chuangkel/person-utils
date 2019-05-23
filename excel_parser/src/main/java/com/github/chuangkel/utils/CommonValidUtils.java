package com.github.chuangkel.personalutils.utils;

import java.util.Collection;
import java.util.Map;

/**
 *
* @Description: 公共校验工具
* @author chuangkel
* @date
*
 */
public class CommonValidUtils {
	public static boolean isNull(Object o) {
		return (o == null);
	}

	public static boolean isNotNull(Object o) {
		return o != null;
	}

	@SuppressWarnings("unchecked")
	public static boolean isEmpty(Object obj) {
		if (obj == null) {
			return true;
		}

		if (obj instanceof Collection) {
			// 集合
			return ((Collection<Object>) obj).size() == 0;
		} else if (obj instanceof Map) {
			// Map
			return ((Map<Object, Object>) obj).isEmpty();
		} else if (obj.getClass().isArray()) {
			// 数组
			Class<?> cmpType = obj.getClass().getComponentType();
			if (cmpType == long.class) {
				return ((long[]) obj).length == 0;
			} else if (cmpType == int.class) {
				return ((int[]) obj).length == 0;
			} else if (cmpType == short.class) {
				return ((short[]) obj).length == 0;
			} else if (cmpType == double.class) {
				return ((double[]) obj).length == 0;
			} else if (cmpType == float.class) {
				return ((float[]) obj).length == 0;
			} else {
				return ((Object[]) obj).length == 0;
			}
		} else {
			// String
			return obj.toString().trim().length() == 0;
		}
	}

	public static boolean isNotEmpty(Object obj) {
		return !isEmpty(obj);
	}
}
