package com.ltts.restaurant.Restaurantapplication.bo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ltts.restaurant.Restaurantapplication.Model.Item;

@Repository
public class ItemBO {

	
	@Autowired
	SessionFactory sf;
	
	public boolean insertItem(Item t)
	{
		System.out.println("Inside itembo");
		boolean b = false;
		Session s=sf.openSession();
		s.beginTransaction();
		s.save(t);
		s.getTransaction().commit();
		s.close();
		return false;
		
	}
	public boolean updateItem(Item t)
	{
		System.out.println("Inside itembo");
		boolean b = false;
		Session s=sf.openSession();
		s.beginTransaction();
		s.merge(t);
		s.getTransaction().commit();
		s.close();
		return false;
	}
	public List<Item> getAllItems()
	{
		List<Item> li=null;
		Session s=sf.openSession();
		s.beginTransaction();
		li=s.createQuery("from Item",Item.class).getResultList();
		s.getTransaction().commit();
		s.close();
		return li;
	}
}
