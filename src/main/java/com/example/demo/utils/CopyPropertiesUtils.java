package com.example.demo.utils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class CopyPropertiesUtils {

    public static Object copyProperties(Object copyTo, Object copyFrom){

        try {
            BeanUtils.copyProperties(copyTo, copyFrom);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
        return copyTo;
    }
}
