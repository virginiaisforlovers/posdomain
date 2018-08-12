package com.inss.atmn.POJOs;

import java.util.List;

public class OfficeListPOJO {

  private List<Integer> repId;
  private List<String> state;
  private List<String> district;
  private String firstName;
  private String lastName;
  private String party;
  private String officeRoom;
  private String phone;
  private String email;
  private String committeeAssignment;

  public List<Integer> getRepId() {
    return repId;
  }

  public void setRepId(List<Integer> repId) {
    this.repId = repId;
  }

  public List<String> getDistrict() {
    return district;
  }

  public void setDistrict(List<String> district) {
    this.district = district;
  }

  public List<String> getState() {
    return state;
  }

  public void setState(List<String> state) {
    this.state = state;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getParty() {
    return party;
  }

  public void setParty(String party) {
    this.party = party;
  }

  public String getOfficeRoom() {
    return officeRoom;
  }

  public void setOfficeRoom(String officeRoom) {
    this.officeRoom = officeRoom;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getCommitteeAssignment() {
    return committeeAssignment;
  }

  public void setCommitteeAssignment(String committeeAssignment) {
    this.committeeAssignment = committeeAssignment;
  }

}
