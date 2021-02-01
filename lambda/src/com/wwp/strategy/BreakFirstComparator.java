package com.wwp.strategy;

/**
 * @title
 * @description 增加比较器，重写比较方法，扩展规则
 * @author admin 
 * @updateTime   
 * @throws 
 */
public class BreakFirstComparator implements Comparator<BreakFirst> {
    /**
     * 重新定义规则
     * @param o1
     * @param o2
     * @return
     */
    @Override
    public int compare(BreakFirst o1, BreakFirst o2) {
        if(o1.getFoodSum() > o2.getFoodSum()){
            return 1;
        }else if(o1.getFoodSum() == o2.getFoodSum()){
            return 0;
        }
        return -1;
    }
}
