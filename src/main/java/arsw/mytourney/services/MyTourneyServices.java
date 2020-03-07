package arsw.mytourney.services;

import arsw.mytourney.persistence.MyTourneyPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyTourneyServices {

    @Autowired
    private MyTourneyPersistence mts = null;


}
