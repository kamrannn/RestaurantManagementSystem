package com.ltts.restaurant.Restaurantapplication.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Item {
    @Id
    @GeneratedValue
    private int itemID;
    private String itemName;
    private String price;
    private String spice;//change to taste
    private LocalDate date;
    private LocalTime mealtime;

    public Item(int itemID, String itemName, String price, String spice, LocalDate date, LocalTime localTime) {
        super();
        this.itemID = itemID;
        this.itemName = itemName;
        this.price = price;
        this.spice = spice;
        this.date = date;
        this.mealtime = localTime;
    }

    public Item() {
        super();
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getSpice() {
        return spice;
    }

    public void setSpice(String spice) {
        this.spice = spice;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getMealtime() {
        return mealtime;
    }

    public void setMealtime(LocalTime mealtime) {
        this.mealtime = mealtime;
    }

    @Override
    public String toString() {
        return "Item [itemID=" + itemID + ", itemName=" + itemName + ", price=" + price + ", spice=" + spice + ", date="
                + date + ", mealtime=" + mealtime + "]";
    }


}
