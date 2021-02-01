package com.wwp.strategy;

/**
 * @title 比较器
 * @description 定义接口，实现定制的规比较则
 * @author admin
 * @updateTime
 * @throws
 */
public interface Comparator<T> {
    int compare(T o1,T o2);
}
