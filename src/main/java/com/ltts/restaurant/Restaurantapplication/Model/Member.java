package com.ltts.restaurant.Restaurantapplication.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Member {

    @Id
    private String email;
    private String phone;
    private String name;

    public Member(String email, String phone, String name) {
        super();
        this.email = email;
        this.phone = phone;
        this.name = name;
    }

    public Member() {
        super();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Member [email=" + email + ", phone=" + phone + ", name=" + name + "]";
    }


}
