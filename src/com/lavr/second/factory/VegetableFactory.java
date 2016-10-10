package com.lavr.second.factory;

import com.lavr.second.entity.*;
import com.lavr.second.type.*;

/**
 * Created by 123 on 02.10.2016.
 */
abstract class VegetableFactory {
    private static BulbCrop createBulbCropVegetable(String[] properties) throws IllegalVegetableException {
        try {
            BulbCropType type = BulbCropType.valueOf(properties[0].toUpperCase());
            double weight = Double.parseDouble(properties[1]);
            int calories = Integer.parseInt(properties[2]);
            double proteins = Double.parseDouble(properties[3]);
            double carbohydrates = Double.parseDouble(properties[4]);
            double vitaminC = Double.parseDouble(properties[5]);
            double height = Double.parseDouble(properties[6]);
            float liquid = Float.parseFloat(properties[7]);

            return new BulbCrop(weight, calories, proteins, carbohydrates, vitaminC, type, height, liquid);

        } catch (NumberFormatException ex) {
            throw new IllegalVegetableException("Vegetable " + properties[0] + " is wrong. Please, check your data", ex);
        }catch (ArrayIndexOutOfBoundsException ex){
            throw  new IllegalVegetableException("Incorrect number of parameters at "+properties[0],ex);
        }
    }

    private static FruitCrop createFruitCropVegetable(String[] properties) throws IllegalVegetableException {
        try {
            FruitCropType type = FruitCropType.valueOf(properties[0].toUpperCase());
            double weight = Double.parseDouble(properties[1]);
            int calories = Integer.parseInt(properties[2]);
            double proteins = Double.parseDouble(properties[3]);
            double carbohydrates = Double.parseDouble(properties[4]);
            double vitaminC = Double.parseDouble(properties[5]);
            FruitCropFamilyType familyType = FruitCropFamilyType.valueOf(properties[6].toUpperCase());
            float sugar = Float.parseFloat(properties[7]);
            float liquid = Float.parseFloat(properties[8]);

            return new FruitCrop(weight, calories, proteins, carbohydrates, vitaminC, type, familyType, sugar, liquid);
        } catch (NumberFormatException ex) {
            throw new IllegalVegetableException("Vegetable " + properties[0] + " is wrong. Please, check your data", ex);
        }catch (ArrayIndexOutOfBoundsException ex){
            throw  new IllegalVegetableException("Incorrect number of parameters at "+properties[0],ex);
        }
    }

    private static LeavesCrop createLeavesCropVegetable(String[] properties) throws IllegalVegetableException {
        try {
            LeavesCropType type = LeavesCropType.valueOf(properties[0].toUpperCase());
            double weight = Double.parseDouble(properties[1]);
            int calories = Integer.parseInt(properties[2]);
            double proteins = Double.parseDouble(properties[3]);
            double carbohydrates = Double.parseDouble(properties[4]);
            double vitaminC = Double.parseDouble(properties[5]);
            double diameter = Double.parseDouble(properties[6]);
            int calcium = Integer.parseInt(properties[7]);

            return new LeavesCrop(weight, calories, proteins, carbohydrates, vitaminC, type, diameter, calcium);
        } catch (NumberFormatException ex) {
            throw new IllegalVegetableException("Vegetable " + properties[0] + " is wrong. Please, check your data", ex);
        }catch (ArrayIndexOutOfBoundsException ex){
            throw  new IllegalVegetableException("Incorrect number of parameters at "+properties[0],ex);
        }
    }

    private static RootCrop createRootCropVegetable(String[] properties) throws IllegalVegetableException {
        try {
            RootCropType type = RootCropType.valueOf(properties[0].toUpperCase());
            double weight = Double.parseDouble(properties[1]);
            int calories = Integer.parseInt(properties[2]);
            double proteins = Double.parseDouble(properties[3]);
            double carbohydrates = Double.parseDouble(properties[4]);
            double vitaminC = Double.parseDouble(properties[5]);
            RootCropNutrientsType nutrientsType = RootCropNutrientsType.valueOf(properties[6].toUpperCase());
            double length = Double.parseDouble(properties[7]);
            float sugar = Float.parseFloat(properties[8]);

            return new RootCrop(weight, calories, proteins, carbohydrates, vitaminC, type, nutrientsType, length, sugar);
        } catch (NumberFormatException ex) {
            throw new IllegalVegetableException("Vegetable " + properties[0] + " is wrong. Please, check your data", ex);
        }catch (ArrayIndexOutOfBoundsException ex){
            throw  new IllegalVegetableException("Incorrect number of parameters at "+properties[0],ex);
        }
    }

    static Vegetable createVegetableFromFactory(String type, String[] properties) throws IllegalVegetableException {
        if (BulbCropType.contains(type)) {
            return createBulbCropVegetable(properties);
        } else if (FruitCropType.contains(type)) {
            return createFruitCropVegetable(properties);
        } else if (LeavesCropType.contains(type)) {
            return createLeavesCropVegetable(properties);
        } else if (RootCropType.contains(type)) {
            return createRootCropVegetable(properties);
        } else {
            throw new IllegalVegetableException("Can't find such vegetable " + type);
        }
    }
}
