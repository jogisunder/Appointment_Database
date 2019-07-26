package com.hospital.appointmentbooking.department;

import javax.persistence.*;

@Entity
@Table(name = "Contact")
public class Contact {

   @Id
   @GeneratedValue(strategy= GenerationType.AUTO)
   private Long id;
   private String firstname;
   private  String lastname;
   private  Integer phoneNumber;
   private  String email;

   @OneToOne(fetch = FetchType.LAZY, optional = false)
   @JoinColumn(name = "FK_Department", nullable = false)
   private Department department;

   private ContactType  type;

   @OneToOne(fetch = FetchType.LAZY,
           cascade =  CascadeType.ALL,
           mappedBy = "Contact")
   private Availability availability;

   @OneToOne(fetch = FetchType.LAZY,
           cascade =  CascadeType.ALL,
           mappedBy = "Contact")
   private Appointment appointment;

   public Contact(String firstname, String lastname, Integer phoneNumber, String email) {
      this.firstname = firstname;
      this.lastname = lastname;
      this.phoneNumber = phoneNumber;
      this.email = email;
   }

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getFirstname() {
      return firstname;
   }

   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }

   public String getLastname() {
      return lastname;
   }

   public void setLastname(String lastname) {
      this.lastname = lastname;
   }

   public Integer getPhoneNumber() {
      return phoneNumber;
   }

   public void setPhoneNumber(Integer phoneNumber) {
      this.phoneNumber = phoneNumber;
   }

   public String getEmail() {
      return email;
   }

   public void setEmail(String email) {
      this.email = email;
   }

   @Override
   public String toString() {
      return "Contact{" +
              "id=" + id +
              ", firstname='" + firstname + '\'' +
              ", lastname='" + lastname + '\'' +
              ", phoneNumber=" + phoneNumber +
              ", email='" + email + '\'' +
              ", department=" + department +
              ", type=" + type +
              '}';
   }
}
