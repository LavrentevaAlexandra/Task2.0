package com.lavr.second.entity;

import com.lavr.second.type.BulbCropType;

/**
 * Created by 123 on 02.10.2016.
 */
public class BulbCrop extends Vegetable {
    private BulbCropType typeOfBulbCropVegetable;
    private double heightOfLeaves;
    private float liquidPercentage;

    public BulbCrop(double weight, int calorificValue, double proteins, double carbohydrates, double vitaminC,
                    BulbCropType typeOfBulbCropVegetable, double heightOfLeaves, float liquidPercentage) {
        super(weight, calorificValue, proteins, carbohydrates, vitaminC);
        this.typeOfBulbCropVegetable = typeOfBulbCropVegetable;
        this.heightOfLeaves = heightOfLeaves;
        this.liquidPercentage = liquidPercentage;
    }

    public String getTypeOfBulbCropVegetable() {
        return typeOfBulbCropVegetable.toString();
    }

    @Override
    public String toString() {
        return typeOfBulbCropVegetable.toString()+"     "+getCalorificValue()+" calories";
    }
}
