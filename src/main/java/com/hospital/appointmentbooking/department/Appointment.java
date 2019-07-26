package com.hospital.appointmentbooking.department;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "Appointment")
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FK_Contact", nullable = false)
    private Contact Doctor;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FK_Contact", nullable = false)
    private Contact Patient;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "FK_Department", nullable = false)
    private Department department;

    private Date date;
    private String comment;

    public Appointment(Contact doctor, Contact patient, Department department, Date date, String comment) {
        Doctor = doctor;
        Patient = patient;
        this.department = department;
        this.date = date;
        this.comment = comment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Contact getDoctor() {
        return Doctor;
    }

    public void setDoctor(Contact doctor) {
        Doctor = doctor;
    }

    public Contact getPatient() {
        return Patient;
    }

    public void setPatient(Contact patient) {
        Patient = patient;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "id=" + id +
                ", Doctor=" + Doctor +
                ", Patient=" + Patient +
                ", department=" + department +
                ", date=" + date +
                ", comment='" + comment + '\'' +
                '}';
    }
}
