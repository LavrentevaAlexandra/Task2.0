package com.lavr.second.entity;

import com.lavr.second.type.LeavesCropType;

/**
 * Created by 123 on 02.10.2016.
 */
public class LeavesCrop extends Vegetable {
    private LeavesCropType typeOfLeavesCropVegetable;
    private double diameter;
    private int calcium;       // in milligram per 100 gram

    public LeavesCrop(double weight, int calorificValue, double proteins, double carbohydrates, double vitaminC,
                      LeavesCropType typeOfLeavesCropVegetable, double diameter, int calcium) {
        super(weight, calorificValue, proteins, carbohydrates, vitaminC);
        this.typeOfLeavesCropVegetable = typeOfLeavesCropVegetable;
        this.diameter = diameter;
        this.calcium = calcium;
    }

    public String getTypeOfLeavesCropVegetable() {
        return typeOfLeavesCropVegetable.toString();
    }

    @Override
    public String toString() {
        return typeOfLeavesCropVegetable.toString()+"     "+getCalorificValue()+" calories";
    }
}
