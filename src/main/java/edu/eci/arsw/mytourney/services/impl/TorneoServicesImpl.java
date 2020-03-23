package edu.eci.arsw.mytourney.services.impl;

import edu.eci.arsw.mytourney.exceptions.TorneoException;
import edu.eci.arsw.mytourney.model.Torneo;
import edu.eci.arsw.mytourney.persistence.TorneoRepository;
import edu.eci.arsw.mytourney.services.TorneoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TorneoServicesImpl implements TorneoServices {

    @Autowired
    TorneoRepository torneoRepository;

    @Override
    public void crearTorneo(Torneo torneo)throws TorneoException {
        if(!torneoRepository.existsById(1)){
            torneoRepository.save(torneo);
        }
        else {
            throw new TorneoException("Ya hay un torneo creado");
        }
    }

    @Override
    public Torneo getTorneo()throws TorneoException {
        if(torneoRepository.existsById(1)){
            return torneoRepository.findById(1).get();
        }
        else {
            throw new TorneoException("No hay un torneo creado");
        }
    }

}
