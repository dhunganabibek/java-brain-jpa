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
    employee.setName("Bibek Dhungana");
    employee.setDob(new Date());
    employee.setAge(25);
    employee.setSsn("123456789");
    employee.setType(EmployeeType.FULL_TIME);

    Employee employee1 = new Employee();
    employee1.setName("Amrit Upadyaya");
    employee1.setDob(new Date());
    employee1.setAge(25);
    employee1.setSsn("987654321");
    employee1.setType(EmployeeType.CONTRACTOR);

    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(
      "myApp"
    );
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    EntityTransaction transaction = entityManager.getTransaction();
    transaction.begin();
    entityManager.persist(employee);
    entityManager.persist(employee1);
    transaction.commit();
    entityManagerFactory.close();
    entityManager.close();
  }
}
