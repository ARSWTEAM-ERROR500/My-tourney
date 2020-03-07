package arsw.mytourney.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/a")
public class MyTourneyAPIController {

    @RequestMapping(method = RequestMethod.GET)
    public String construccion(){

            //obtener datos que se enviarán a través del API
            return new String("En construccion");
    }

}
