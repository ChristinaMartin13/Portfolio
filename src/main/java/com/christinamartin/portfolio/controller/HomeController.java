package com.christinamartin.portfolio.controller;  //package declaration


import org.springframework.stereotype.Controller; //Imports the @Controller annotation from Spring Framework. This class handles incoming web requests, and returns views.
import org.springframework.web.bind.annotation.GetMapping; //Imports the @GetMapping annotation. Maps HTTP GET requests to a specific method.

@Controller //Tells spring the class below is a web controller.
public class HomeController { //Class that can hold one or more methods that handle web requests.
    @GetMapping("/") //Maps HTTP GET requests to "/" (root url) to the method below.
    public String home() { //method that runs when someone visits "/" (the root url).
        return "index"; //renders the index.html file
    }
}
