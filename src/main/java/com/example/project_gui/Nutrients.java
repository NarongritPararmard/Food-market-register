package com.example.project_gui;

public class Nutrients {
    String nutrients;
    double amount;
//    public Nutrients(){
//        this.nutrients = "";
//        this.amount = 0;
//    }
    public Nutrients(String nutrient, double amount){
        this.nutrients = nutrient;
        this.amount = amount;
    }
    public void setNutrient(String nutrient){
        this.nutrients = nutrient;
    }
    public void setAmount(double amount){
        this.amount = amount;
    }
    public String getNutrient(){
        return this.nutrients;
    }
    public double getAmount(){
        return  this.amount;
    }
}
