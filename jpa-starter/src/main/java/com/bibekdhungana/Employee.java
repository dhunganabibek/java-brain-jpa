package com.bibekdhungana;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
  @Id
  @Column(name = "ID")
  private int id;

  @Column(name = "EMPLOYEE_NAME")
  private String name;

  @Column(name = "AGE")
  private int age;

  @Column(name = "SSN", unique = true, length = 9)
  private String ssn;

  public Employee() {}

  public Employee(int id, String name, int age) {
    this.id = id;
    this.name = name;
    this.age = age;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
