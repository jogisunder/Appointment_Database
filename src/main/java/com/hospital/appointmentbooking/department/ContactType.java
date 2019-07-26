package com.hospital.appointmentbooking.department;

import javax.persistence.*;

public class ContactType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

}
