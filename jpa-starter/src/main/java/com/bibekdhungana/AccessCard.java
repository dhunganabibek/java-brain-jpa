package com.bibekdhungana;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ACCESSCARD")
public class AccessCard {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  private Date issuedDate;
  private boolean isActive;
  private String firmwareVersion;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getIssuedDate() {
    return this.issuedDate;
  }

  public void setIssuedDate(Date issuedDate) {
    this.issuedDate = issuedDate;
  }

  public boolean isIsActive() {
    return this.isActive;
  }

  public boolean getIsActive() {
    return this.isActive;
  }

  public void setIsActive(boolean isActive) {
    this.isActive = isActive;
  }

  public String getFirmwareVersion() {
    return this.firmwareVersion;
  }

  public void setFirmwareVersion(String firmwareVersion) {
    this.firmwareVersion = firmwareVersion;
  }
}
