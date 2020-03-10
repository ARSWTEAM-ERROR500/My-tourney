package edu.arsw.mytourney.controllers;

import edu.arsw.mytourney.persistence.JugadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/")
public class MyTourneyAPIController {


    @Autowired
    private JugadorRepository Repository;

    public String getMensaje() {
        return "Estamos Trabajando en ECI-STAURANT ;)";

    }

}

