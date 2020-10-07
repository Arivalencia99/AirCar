package com.proyecto.AirCar.controller;

import com.proyecto.AirCar.model.Auto;
import com.proyecto.AirCar.service.AutoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/auto")
public class AutoController {

    private AutoService autoService;

    @Autowired
    public AutoController(AutoService autoService){
        this.autoService = autoService;
    }

    @PostMapping(path = "/save")
    @ApiOperation(value = "guarde auto", response = Auto.class)
    public Auto saveAuto(@RequestBody Auto auto){
        return autoService.saveAuto(auto);
    }

    @PostMapping(path = "/update")
    @ApiOperation(value = "actualice auto", response = Auto.class)
    public Auto updateAuto(@RequestBody Auto auto){
        return autoService.saveAuto(auto);
    }

    @DeleteMapping(path = "/delete")
    @ApiOperation(value = "elimine auto", response = Auto.class)
    public void deleteById(@RequestParam(name = "id_auto") long id_auto){
        autoService.deleteAuto(id_auto);

    }

    @GetMapping(path = "/all")
    @ApiOperation(value = "consulte auto", response = Auto.class)
    public List<Auto> findAll(){
        return  autoService.findAll();
    }
}
