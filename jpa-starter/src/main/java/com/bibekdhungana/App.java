package com.bibekdhungana;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

  public static void main(String[] args) {
    System.out.println("Hello World!");

    Employee employee = new Employee();
    employee.setId(1);
    employee.setName("Bibek Dhungana");
    employee.setDob(new Date());
    employee.setAge(25);
    employee.setSsn("123456789");

    Employee employee1 = new Employee();
    employee1.setId(2);
    employee1.setName("Amrit Upadyaya");
    employee1.setDob(new Date());
    employee1.setAge(25);
    employee1.setSsn("987654321");

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(
      "myApp"
    );
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    EntityTransaction transaction = entityManager.getTransaction();
    transaction.begin();
    entityManager.persist(employee);
    entityManager.persist(employee1);
    transaction.commit();
  }
}
