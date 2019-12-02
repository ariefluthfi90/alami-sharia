package com.alami.sharia.application.util;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class GetterSetterUtil {

    private GetterSetterUtil() {
        throw new IllegalStateException("Util class");
    }

    public static Object invoke(Object oldObject, Object newObject, Class<?> classObject){
        Field[] fields = classObject.getDeclaredFields();

        for (Field f: fields) {
            String fieldName = f.getName();
            Object object = callGetter(newObject, fieldName);
            callSetter(oldObject, fieldName, object);
        }
        return oldObject;
    }

    /**
     * @param obj
     * @param fieldName
     * @param value
     */
    private static void callSetter(Object obj, String fieldName, Object value){
        PropertyDescriptor pd;
        try {
            pd = new PropertyDescriptor(fieldName, obj.getClass());
            pd.getWriteMethod().invoke(obj, value);
        } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * @param obj
     * @param fieldName
     */
    private static Object callGetter(Object obj, String fieldName){
        PropertyDescriptor pd;
        try {
            pd = new PropertyDescriptor(fieldName, obj.getClass());
            return pd.getReadMethod().invoke(obj);
        } catch (IntrospectionException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
            return null;
        }

    }

}
