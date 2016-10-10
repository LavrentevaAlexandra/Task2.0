package com.lavr.second.logic;

import com.lavr.second.entity.Salad;
import com.lavr.second.entity.Vegetable;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;



/**
 * Created by 123 on 03.10.2016.
 */
public class SaladAction {
    public int countCalorificValue(Salad salad){
        int calorificValue=0;
        for (Vegetable vegetable: salad.getIngredients()){
            calorificValue+=vegetable.getCalorificValue();
        }
        return calorificValue;
    }
    public List<Vegetable> findIngredientByCalorific(Salad salad,int minValue,int maxValue){
        List<Vegetable> suitableVegetables=new ArrayList<>();
        int value=0;
        for(Vegetable vegetable:salad.getIngredients()){
            value=vegetable.getCalorificValue();
            if(value<=maxValue && value>=minValue){
                suitableVegetables.add(vegetable);
            }
        }
        return suitableVegetables;
    }
    public Salad sortByCalorificValue(Salad salad){
        Collections.sort(salad.getIngredients(), new Comparator<Vegetable>() {
            @Override
            public int compare(Vegetable o1, Vegetable o2) {
                return o1.getCalorificValue()-o2.getCalorificValue();
            }
        });
        return salad;
    }
}
