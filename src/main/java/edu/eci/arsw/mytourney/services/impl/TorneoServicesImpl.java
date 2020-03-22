package edu.eci.arsw.mytourney.services.impl;

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
    public void crearTorneo(Torneo torneo) {
        torneoRepository.save(torneo);
    }

    @Override
    public Torneo getTorneo() {
        return torneoRepository.findById(1).get();
    }
}
