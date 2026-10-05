package com.nailsalon.booking.model;
import jakarta.persistence.*;

@Entity
@Table(name = "services")
public class Service {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "service_name")
    private String serviceName;

    private double price;

    private int duration;

    public Service(){

    }
     public Service(String serviceName, double price, int duration){
        this.serviceName = serviceName;

     }




}
