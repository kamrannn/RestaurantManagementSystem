package com.ltts.restaurant.Restaurantapplication.bo;

import com.ltts.restaurant.Restaurantapplication.Model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
