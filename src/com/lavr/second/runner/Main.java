package com.lavr.second.runner;

import com.lavr.second.entity.Salad;
import com.lavr.second.entity.Vegetable;
import com.lavr.second.factory.FactoryMethodRunner;
import com.lavr.second.reporter.Reporter;
import java.util.List;

/**
 * Created by 123 on 02.10.2016.
 */
public class Main {
    private static final String FILE_NAME = "files\\Vegetables.txt";
    private static final int MIN=3;
    private static final int MAX=19;

    public static void main(String[] args) {
        List<Vegetable> ingredientList=FactoryMethodRunner.createSalad(FILE_NAME);
        Salad salad=new Salad("Sunny",ingredientList);
        Reporter rep=new Reporter();
        rep.showSaladIngredients(salad);
        rep.showCalorificValue(salad);
        rep.showSuitableByCalorific(salad,MIN,MAX);
        rep.showSorted(salad);
    }
}
