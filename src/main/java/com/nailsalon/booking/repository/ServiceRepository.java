package com.nailsalon.booking.repository;

import com.nailsalon.booking.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Long> {

}
