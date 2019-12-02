package com.alami.sharia.application.util;

import com.google.gson.Gson;

public class ParseUtil {

    public static Object parseObject(Object object, Class<?> classLoader){
        Gson gson = new Gson();
        String json = gson.toJson(object);
        return gson.fromJson(json, classLoader);
    }

}
