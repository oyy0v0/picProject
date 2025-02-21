package com.bitzh.picturebackend.utils;

import java.awt.*;

/**
 * 颜色转换工具类
 *@author oyy0v0
 *@version 1.0.0
 *@create 2025/2/21 15:35
 */


public class ColorTransformUtils {

    private ColorTransformUtils() {
        // 工具类不需要实例化
    }

    /**
     * 获取标准颜色（将数据万象的5位颜色转换为六位）
     * @param color 颜色
     * @return 标准颜色
     */
    public static String getStandardColor(String color) {
        // 不是标准的rgb
        if(color.length() == 7){
            color = color.substring(0,4)+"0"+color.substring(4,7);
        }
        if(color.length() == 6){
            for(int i = 2;i<color.length();i++){
                if(color.charAt(i) == '0' && color.charAt(i-1) == '0'){
                    color = color.substring(0,i)+"00"+color.substring(i,6);
                }
            }
        }
        if(color.length() == 5){
            //直接在最后加三个0
            color = color+"000";
        }
        return color;
    }
}

