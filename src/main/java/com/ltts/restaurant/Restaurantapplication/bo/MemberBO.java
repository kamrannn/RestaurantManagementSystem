package com.ltts.restaurant.Restaurantapplication.bo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.restaurant.Restaurantapplication.Model.Member;

@Repository
public interface MemberBO extends JpaRepository<Member,String> {


}
