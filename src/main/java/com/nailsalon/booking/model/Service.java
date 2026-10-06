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
        this.price = price;
        this.duration = duration;
     }

     public Long getId(){
        return this.id;
     }

     public String getServiceName(){
        return this.serviceName;
     }

     public double getPrice(){
        return this.price;
    }

    public int getDuration(){
        return this.duration;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }




}
