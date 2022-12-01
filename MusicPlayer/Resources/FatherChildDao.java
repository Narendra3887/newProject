package com.jspiders.DAO;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jspiders.DTO.ChildDto;
import com.jspiders.DTO.FatherDto;

public class FatherChildDao {
private static EntityManagerFactory factory;
private static EntityManager manager;
private static EntityTransaction transaction;

private static void openConnection() {
	factory=Persistence.createEntityManagerFactory("data");
	manager=factory.createEntityManager();
	transaction=manager.getTransaction();
} 
private static void closeConnection() {
	
	factory.close();
	manager.close();
	transaction.rollback();
}
public static void main(String[] args) {
	openConnection();
	transaction.begin();
	ChildDto child1=new ChildDto();
	child1.setAge(15);
	child1.setId(1);
	child1.setName("Rohan");
	
	ChildDto child2=new ChildDto();
	child2.setAge(20);
	child2.setId(2);
	child2.setName("Ravina");
	manager.persist(child1);
	manager.persist(child2);

	FatherDto father=new FatherDto();
	father.setAge(50);
	father.setId(1);
	father.setName("Prakash");
	
	List<ChildDto>children=Arrays.asList(child1,child2);
	father.setChildren(children);
	manager.persist(father);
	transaction.commit();
	closeConnection();
}
}
