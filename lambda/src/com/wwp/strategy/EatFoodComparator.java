package com.wwp.strategy;

public class EatFoodComparator implements Comparator<EatFood> {
    @Override
    public int compare(EatFood o1, EatFood o2) {
        if(o1.getFoodSum() > o2.getFoodSum()){
            return 1;
        }else if(o1.getFoodSum() == o2.getFoodSum()){
            return 0;
        }
        return -1;
    }
}
