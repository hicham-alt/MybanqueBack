package globalProject.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCustomer {

    @GetMapping("/api")
    public String entrr(){

        return "ok";

    }
}
