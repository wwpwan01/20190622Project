package com.wwp.lambda;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BeanGetTest {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException, InvocationTargetException, NoSuchMethodException {
        Class<?> aClass = Class.forName("com.wwp.lambda.Test");
        Field declaredFields = aClass.getDeclaredField("name");
        //设置属性是否能被访问
        declaredFields.setAccessible(true);
        System.out.println(declaredFields.getName());
        Object o = aClass.newInstance();
        declaredFields.set(o,"hehe");
        System.out.println(((Test)o).getName());
        Method[] methods = aClass.getMethods();
        for (Method m : methods)
            System.out.println(m.getName());

        Method getAddress = aClass.getDeclaredMethod("show", String.class, String.class);
        getAddress.setAccessible(true);
        Object o1 = aClass.newInstance();
        getAddress.invoke(o1,"伤害","shanghai");
    }
}
