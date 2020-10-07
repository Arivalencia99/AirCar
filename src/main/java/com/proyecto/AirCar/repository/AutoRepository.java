package com.proyecto.AirCar.repository;

import com.proyecto.AirCar.model.Auto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface AutoRepository  extends JpaRepository<Auto, Long> {
}
