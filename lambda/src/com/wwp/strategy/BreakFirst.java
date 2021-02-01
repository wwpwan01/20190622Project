package com.wwp.strategy;

public class BreakFirst implements Comparable<BreakFirst> {
    int foodSum;

    public int getFoodSum() {
        return foodSum;
    }

    public void setFoodSum(int foodSum) {
        this.foodSum = foodSum;
    }

    public BreakFirst() {
    }

    public BreakFirst(int foodSum) {
        this.foodSum = foodSum;
    }

    @Override
    public String toString() {
        return "BreakFirst{" +
                "foodSum=" + foodSum +
                '}';
    }

//    @Override
//    public int compareTo(BreakFirst food) {
//        if(this.foodSum > food.foodSum){
//            return 1;
//        }else if(this.foodSum == food.foodSum){
//            return 0;
//        }
//        return -1;
//    }
}
