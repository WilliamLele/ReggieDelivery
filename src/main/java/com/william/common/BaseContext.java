package com.william.common;

/**
 * 基于ThreadLocal封装工具类，用户保存和获取当前登录用户id
 * Created by William Wang 2024/6/21
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置
     * @param id
     */
    public static void setCurrentId(Long id){
        threadLocal.set(id);
    }

    /**
     * 获取
     * @return
     */
    public static Long getCurrentId(){
        return threadLocal.get();
    }
}
