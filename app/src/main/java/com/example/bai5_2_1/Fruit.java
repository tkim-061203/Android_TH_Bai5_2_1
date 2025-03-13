package com.example.bai5_2_1;


public class Fruit {
    private static final String TAG = "Fruit";

    private int fruitImg;
    private String fruitName;
    private String calories;

    public Fruit(int fruitImg, String fruitName,String calories) {
        super();
        this.setFruitImg(fruitImg);
        this.setFruitName(fruitName);
        this.setCalories(calories);
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getFruitImg() {
        return fruitImg;
    }

    public void setFruitImg(int fruitImg) {
        this.fruitImg = fruitImg;
    }

    public String getCalories() {
        return calories;
    }

    public void setCalories(String calories) {
        this.calories = calories;
    }
}