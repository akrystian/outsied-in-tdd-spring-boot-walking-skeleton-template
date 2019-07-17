package pro.adamski.tdd.outsidein.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class SomeController {

    @GetMapping
    String print() {
        return "some";
    }
}
