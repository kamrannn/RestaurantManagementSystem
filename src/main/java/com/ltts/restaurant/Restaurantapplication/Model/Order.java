package com.ltts.restaurant.Restaurantapplication.Model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "Item_Order")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Integer orderID;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "order_date")
    private LocalDate date;
    @Column(name = "order_time")
    private LocalTime time;
    @Column(name = "item_price")
    private String price;
    @Column(name = "total_price")
    private String total;
    @Column(name = "payment_type")
    private String paymentType;
    @Column(name = "number_of_meals")
    private int numOfMeals;

    public Order() {
    }

    public Order(String itemName, LocalDate date, LocalTime time, String price, String total, String paymentType, int numOfMeals) {
        this.itemName = itemName;
        this.date = date;
        this.time = time;
        this.price = price;
        this.total = total;
        this.paymentType = paymentType;
        this.numOfMeals = numOfMeals;
    }

    public Integer getOrderID() {
        return orderID;
    }

    public void setOrderID(Integer orderID) {
        this.orderID = orderID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public int getNumOfMeals() {
        return numOfMeals;
    }

    public void setNumOfMeals(int numOfMeals) {
        this.numOfMeals = numOfMeals;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", itemName='" + itemName + '\'' +
                ", date=" + date +
                ", time=" + time +
                ", price=" + price +
                ", total=" + total +
                ", paymentType='" + paymentType + '\'' +
                ", numOfMeals=" + numOfMeals +
                '}';
    }
}
