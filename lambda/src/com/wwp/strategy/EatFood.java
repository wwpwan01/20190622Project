package com.wwp.strategy;

public class EatFood implements Comparable<EatFood>{

    private String foodName;
    private int foodSum;
    private String tabLeware;

    public String getTabLeware() {
        return tabLeware;
    }

    public void setTabLeware(String tabLeware) {
        this.tabLeware = tabLeware;
    }

    public EatFood(String foodName, int foodSum, String tabLeware) {
        this.foodName = foodName;
        this.foodSum = foodSum;
        this.tabLeware = tabLeware;
    }

    public EatFood() {
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    public int getFoodSum() {
        return foodSum;
    }

    public void setFoodSum(int foodSum) {
        this.foodSum = foodSum;
    }

    @Override
    public String toString() {
        return "EatFood{" +
                "foodName='" + foodName + '\'' +
                ", foodSum=" + foodSum +
                ", tabLeware='" + tabLeware + '\'' +
                '}';
    }

//    @Override
//    public int compareTo(EatFood food) {
//        if(this.foodSum > food.foodSum){
//            return 1;
//        }else if(this.foodSum == food.foodSum){
//            return 0;
//        }
//        return -1;
//    }
}
