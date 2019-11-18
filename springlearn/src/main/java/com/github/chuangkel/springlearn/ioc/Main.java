package com.github.chuangkel.springlearn.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @program: personal-utils
 * @description:
 * @author: chuangkel
 * @create: 2019-07-25 10:55
 **/
public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:application-beanaware.xml");

        User user = context.getBean(User.class);
        System.out.println(String.format("实现了BeanNameAware接口的信息BeanId=%s,所有信息=%s", user.getId(), user.toString()));

        System.out.printf("应用名：%s,是否包含：%s,别名：%s,id:%s,bean:%s,bean定义数量：%s,环境：%s\n",
                user.getApplicationContext().getApplicationName()
                , user.getApplicationContext().containsBean("com.github.chuangkel.springlearn.ioc.User")
                , user.getApplicationContext().getAutowireCapableBeanFactory().getAliases("com.github.chuangkel.springlearn.ioc.User").toString()
                , user.getApplicationContext().getId()
                , user.getApplicationContext().getBean("zhangsan").toString()
                , user.getApplicationContext().getBeanDefinitionCount()
                , user.getApplicationContext().getEnvironment().getActiveProfiles().toString());

        User2 user2 = context.getBean(User2.class);
        System.out.println(String.format("未实现BeanNameAware接口的信息BeanId=%s,所有信息=%s", user2.getId(), user2.toString()));
    }
}
