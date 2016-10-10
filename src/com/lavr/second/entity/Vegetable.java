package com.lavr.second.entity;

/**
 * Created by 123 on 02.10.2016.
 */
public class Vegetable {
    private double weight;           //in grams
    private int calorificValue;         // in kilocalories per 100 gram îf product

    private double proteins;               // in grams per 100 gram îf product
    private double carbohydrates;          // in grams per 100 gram îf product
    private double vitaminC;               // in milligrams per 100 gram îf product

    public Vegetable(double weight, int calorificValue, double proteins, double carbohydrates, double vitaminC) {
        this.weight = weight;
        this.calorificValue = calorificValue;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.vitaminC = vitaminC;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getCalorificValue() {
        return calorificValue;
    }

    public void setCalorificValue(int calorificValue) {
        this.calorificValue = calorificValue;
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "weight=" + weight +
                ", calorificValue=" + calorificValue +
                ", proteins=" + proteins +
                ", carbohydrates=" + carbohydrates +
                ", vitaminC=" + vitaminC +" ";
    }
}
