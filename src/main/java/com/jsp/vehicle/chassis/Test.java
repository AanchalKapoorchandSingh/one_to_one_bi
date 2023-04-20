package com.jsp.vehicle.chassis;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Test {
public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("aanchal");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Vehicle vehicle=new Vehicle();
	vehicle.setBrand("A2");
	vehicle.setColor("gray");
	//vehicle.setChassis(chassis);
	vehicle.setName("suzuki");
	vehicle.setPrice(5000000);
	Chassis chassis=new Chassis();
    chassis.setChassis_no("dfgh85gh85");
    chassis.setVehicle(vehicle);
   vehicle.setChassis(chassis);
    et.begin();
    em.persist(chassis);
    em.persist(vehicle);
    et.commit();
}
}
