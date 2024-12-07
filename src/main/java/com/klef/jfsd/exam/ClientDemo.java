package com.klef.jfsd.exam;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        Vehicle vehicle = new Vehicle() ;
        vehicle.setName(" Vehicle");
        vehicle.setType("Bikes");
        vehicle.setMaxSpeed(101);
        vehicle.setColor("White");
        
        Car car = new Car();
        car.setName("maruthi");
        car.setType("Car");
        car.setMaxSpeed(200);
        car.setColor("White");
        car.setNumberOfDoors(4);

        Truck truck = new Truck();
        truck.setName("Cargo Truck");
        truck.setType("Truck");
        truck.setMaxSpeed(120);
        truck.setColor("Blue");
        truck.setLoadCapacity(10.5);
        
        session.persist(vehicle);

        session.persist(car);
        session.persist(truck);

        tx.commit();
        session.close();

        System.out.println("Records inserted successfully!");
    }
}
