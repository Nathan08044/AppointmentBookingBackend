package com.nailsalon.booking.controller;

import com.nailsalon.booking.model.Service;
import com.nailsalon.booking.repository.ServiceRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services")
public class ServiceController {
    private final ServiceRepository serviceRepository;

    public ServiceController(ServiceRepository serviceRepository){
        this.serviceRepository = serviceRepository;
    }

    @GetMapping
    public List<Service> getAllServices(){
        return serviceRepository.findAll();
    }

    @PostMapping
    public Service creatService(@RequestBody Service service){
        return serviceRepository.save(service);


    }
}
