package com.bibekdhungana;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
  @Id
  @Column(name = "ID")
  @GeneratedValue
  private int id;

  @Column(name = "EMPLOYEE_NAME")
  private String name;

  @Column(name = "AGE")
  private int age;

  @Column(name = "SSN", unique = true, length = 9)
  private String ssn;

  @Temporal(TemporalType.DATE)
  private Date dob;

  @Enumerated(EnumType.STRING)
  private EmployeeType type;

  @Transient
  private String debugString;

  // private transient String debugString;

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

  /**
   * @return String return the ssn
   */
  public String getSsn() {
    return ssn;
  }

  /**
   * @param ssn the ssn to set
   */
  public void setSsn(String ssn) {
    this.ssn = ssn;
  }

  /**
   * @return Date return the dob
   */
  public Date getDob() {
    return dob;
  }

  /**
   * @param dob the dob to set
   */
  public void setDob(Date dob) {
    this.dob = dob;
  }

  /**
   * @return EmployeeType return the type
   */
  public EmployeeType getType() {
    return type;
  }

  /**
   * @param type the type to set
   */
  public void setType(EmployeeType type) {
    this.type = type;
  }

  @Override
  public String toString() {
    return (
      "{" +
      " id='" +
      getId() +
      "'" +
      ", name='" +
      getName() +
      "'" +
      ", age='" +
      getAge() +
      "'" +
      ", ssn='" +
      getSsn() +
      "'" +
      ", dob='" +
      getDob() +
      "'" +
      ", type='" +
      getType() +
      "'" +
      "}"
    );
  }
}
