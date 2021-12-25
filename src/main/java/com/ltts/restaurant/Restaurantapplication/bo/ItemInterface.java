package com.ltts.restaurant.Restaurantapplication.bo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.restaurant.Restaurantapplication.Model.Item;

@Repository
public interface ItemInterface extends JpaRepository<Item, Integer>{


}
