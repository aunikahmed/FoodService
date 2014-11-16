package com.aunik.restfullService.domain;

import java.util.List;

/**
 * Created by muzaddid on 11/16/14.
 */
public class Menu {
    List<String> foodList;
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<String> foodList) {
        this.foodList = foodList;
    }
}
