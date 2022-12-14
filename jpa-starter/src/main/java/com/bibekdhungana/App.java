package com.bibekdhungana;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class App {

  //add employee method : CREATE of CRUD
  public static void addEmployee() {
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

  //reading the employee from the database: READ from CRUD
  public static void readEmployee() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(
      "myApp"
    );
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    Employee employee = entityManager.find(Employee.class, 1);
    System.out.println(employee);
  }

  //Update from CRUD
  public static void updateEmployee() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(
      "myApp"
    );
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    Employee e = entityManager.find(Employee.class, 1);
    System.out.println(e);
    e.setName("Newton Dhungana");

    EntityTransaction entityTransaction = entityManager.getTransaction();
    entityTransaction.begin();
    entityManager.persist(e);
    entityTransaction.commit();
    entityManager.close();
    entityManagerFactory.close();
  }

  //Delete from CRUD
  public static void deleteEmployee() {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(
      "myApp"
    );
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    Employee e = entityManager.find(Employee.class, 2);
    EntityTransaction transaction = entityManager.getTransaction();
    transaction.begin();
    entityManager.remove(e);
    transaction.commit();
    entityManager.close();
    entityManagerFactory.close();
  }

  public static void main(String[] args) {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory(
      "myApp"
    );
    EntityManager entityManager = entityManagerFactory.createEntityManager();

    //creating new object
    Employee employee = new Employee();
    employee.setName("Bibek Dhungana");
    employee.setDob(new Date());
    employee.setAge(25);
    employee.setSsn("123456789");
    employee.setType(EmployeeType.FULL_TIME);

    //creating new access card
    AccessCard card = new AccessCard();
    card.setIssuedDate(new Date());
    card.setIsActive(true);
    card.setFirmwareVersion("1.0.0");

    Employee employee1 = new Employee();
    employee1.setName("Amrit Upadyaya");
    employee1.setDob(new Date());
    employee1.setAge(25);
    employee1.setSsn("987654321");
    employee1.setType(EmployeeType.CONTRACTOR);

    AccessCard card1 = new AccessCard();
    card1.setIssuedDate(new Date());
    card1.setIsActive(false);
    card1.setFirmwareVersion("2.0.0");

    EntityTransaction transaction = entityManager.getTransaction();

    transaction.begin();
    entityManager.persist(employee);
    entityManager.persist(employee1);
    entityManager.persist(card);
    entityManager.persist(card1);
    transaction.commit();

    entityManager.close();
    entityManagerFactory.close();
  }
}
