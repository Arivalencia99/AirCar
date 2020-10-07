package com.proyecto.AirCar.service;

import com.proyecto.AirCar.model.Auto;
import com.proyecto.AirCar.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutoService {
    private final AutoRepository autoRepository;

    @Autowired
    public AutoService(AutoRepository autoRepository){
        this.autoRepository = autoRepository;
    }

    public Auto saveAuto (Auto auto){
        return autoRepository.save(auto);
    }
    public Auto updateAuto (Auto auto){
        return autoRepository.save(auto);
    }
    public void deleteAuto (Long id_auto){
        autoRepository.deleteById(id_auto);
    }
    public List<Auto> findAll(){
        return autoRepository.findAll();
    }
}
