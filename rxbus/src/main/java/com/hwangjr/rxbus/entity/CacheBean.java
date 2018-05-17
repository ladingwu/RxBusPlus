package com.hwangjr.rxbus.entity;

/**
 * Created by 85154 on 2018/5/14.
 */

public class CacheBean {
    public String tag;
    public Object event;
    public CacheBean(){

    }
    public CacheBean(String tag,Object object){
        this.tag=tag;
        this.event=object;

    }
}
