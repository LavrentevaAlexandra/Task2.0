package com.lavr.second.reporter;

import com.lavr.second.entity.Salad;
import com.lavr.second.entity.Vegetable;
import com.lavr.second.logic.SaladAction;


/**
 * Created by 123 on 09.10.2016.
 */
public class Reporter {
    public void showSaladIngredients(Salad salad){
        int  number=1;
        System.out.println("Salad name:"+ salad.getName().toUpperCase());
        showLine();
        for(Vegetable ingredient : salad.getIngredients()){
            System.out.println(number+".    "+ingredient.toString());
            number++;
        }
        System.out.println();
    }
    public void showCalorificValue(Salad salad){
        SaladAction act=new SaladAction();
        showLine();
        System.out.println("Calorific value of your salad is : "+act.countCalorificValue(salad));
    }
    public void  showSuitableByCalorific(Salad salad, int min, int max){
        SaladAction act=new SaladAction();
        showLine();
        System.out.println("Vegetables with calorific value between "+min+" and "+max+" is: "+act.findIngredientByCalorific(salad,min,max));
    }
    public void showSorted(Salad salad){
        SaladAction act=new SaladAction();
        act.sortByCalorificValue(salad);
        showLine();
        showSaladIngredients(salad);
    }
    private void showLine(){
        for(int i=0;i<60;i++){
            System.out.print("-");
        }
        System.out.println();
    }
}
