package com.lavr.second.entity;

import com.lavr.second.type.FruitCropFamilyType;
import com.lavr.second.type.FruitCropType;

import java.io.Serializable;

/**
 * Created by 123 on 02.10.2016.
 */
public class FruitCrop extends Vegetable {
    private FruitCropType typeOfFruitCropVegetable;
    private FruitCropFamilyType typeOfFamilyBelonging;
    private float sugarPercentage;
    private float liquidPercentage;

    public FruitCrop(double weight, int calorificValue, double proteins, double carbohydrates, double vitaminC,
                     FruitCropType typeOfFruitCropVegetable, FruitCropFamilyType typeOfFamilyBelonging, float sugarPercentage,
                     float liquidPercentage) {
        super(weight, calorificValue, proteins, carbohydrates, vitaminC);
        this.typeOfFruitCropVegetable = typeOfFruitCropVegetable;
        this.typeOfFamilyBelonging = typeOfFamilyBelonging;
        this.sugarPercentage = sugarPercentage;
        this.liquidPercentage = liquidPercentage;
    }

    public String getTypeOfFruitCropVegetable() {
        return typeOfFruitCropVegetable.toString();
    }

    @Override
    public String toString() {
        return  typeOfFruitCropVegetable.toString()+"     "+getCalorificValue()+" calories";
    }
}
