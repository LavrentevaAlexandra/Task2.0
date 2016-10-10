package com.lavr.second.entity;

import java.util.List;

/**
 * Created by 123 on 09.10.2016.
 */
public class Salad {
    private String name;
    private List<Vegetable> ingredients;

    public Salad(List<Vegetable> ingredients) {
        this.name="Nameless";
        this.ingredients = ingredients;
    }

    public Salad(String name, List<Vegetable> ingredients) {
        this.name = name;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vegetable> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Vegetable> ingredients) {
        this.ingredients = ingredients;
    }
}
