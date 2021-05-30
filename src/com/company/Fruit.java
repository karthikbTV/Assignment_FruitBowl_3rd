package com.company;

public class Fruit {
    private String firstFruit;
    private String secondFruit;
    private String thirdFruit;
    private Integer firstFruitCount;
    private Integer secondFruitCount;
    private Integer thirdFruitCount;

    public Fruit(String firstFruit, String secondFruit, String thirdFruit,
                 Integer firstFruitCount, Integer secondFruitCount, Integer thirdFruitCount) {
        this.firstFruit = firstFruit;
        this.secondFruit = secondFruit;
        this.thirdFruit = thirdFruit;
        this.firstFruitCount = firstFruitCount;
        this.secondFruitCount = secondFruitCount;
        this.thirdFruitCount = thirdFruitCount;
    }

    public String getFirstFruit() {
        return firstFruit;
    }

    public void setFirstFruit(String firstFruit) {
        this.firstFruit = firstFruit;
    }

    public String getSecondFruit() {
        return secondFruit;
    }

    public void setSecondFruit(String secondFruit) {
        this.secondFruit = secondFruit;
    }

    public String getThirdFruit() {
        return thirdFruit;
    }

    public void setThirdFruit(String thirdFruit) {
        this.thirdFruit = thirdFruit;
    }

    public Integer getFirstFruitCount() {
        return firstFruitCount;
    }

    public void setFirstFruitCount(Integer firstFruitCount) {
        this.firstFruitCount = firstFruitCount;
    }

    public Integer getSecondFruitCount() {
        return secondFruitCount;
    }

    public void setSecondFruitCount(Integer secondFruitCount) {
        this.secondFruitCount = secondFruitCount;
    }

    public Integer getThirdFruitCount() {
        return thirdFruitCount;
    }

    public void setThirdFruitCount(Integer thirdFruitCount) {
        this.thirdFruitCount = thirdFruitCount;
    }
}
