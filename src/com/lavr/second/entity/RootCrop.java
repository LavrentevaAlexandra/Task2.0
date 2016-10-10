package com.lavr.second.entity;

import com.lavr.second.type.RootCropNutrientsType;
import com.lavr.second.type.RootCropType;

/**
 * Created by 123 on 02.10.2016.
 */
public class RootCrop extends Vegetable {
        private RootCropType typeOfRootCropVegetable;
        private RootCropNutrientsType typeOfNutrientsLocation;
        private double length;
        private float sugarPercentage;

    public RootCrop(double weight, int calorificValue, double proteins, double carbohydrates, double vitaminC, RootCropType typeOfRootCropVegetable,
                    RootCropNutrientsType typeOfNutrientsLocation, double length, float sugarPercentage) {
        super(weight, calorificValue, proteins, carbohydrates, vitaminC);
        this.typeOfRootCropVegetable = typeOfRootCropVegetable;
        this.typeOfNutrientsLocation = typeOfNutrientsLocation;
        this.length = length;
        this.sugarPercentage = sugarPercentage;
    }

    public String getTypeOfRootCropVegetable() {
        return typeOfRootCropVegetable.toString();
    }

    @Override
    public String toString() {
        return typeOfRootCropVegetable.toString()+"     "+getCalorificValue()+" calories";
    }
}
