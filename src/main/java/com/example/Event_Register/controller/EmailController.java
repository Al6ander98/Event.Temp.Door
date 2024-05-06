package com.example.Event_Register.controller;

import com.example.Event_Register.model.TemperatureAlertRequest;
import com.example.Event_Register.services.interfaces.IEventservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Notification")
public class EmailController {

    @Autowired
    private IEventservice eventservice;

    @PostMapping("/sendTemperatureAlertEmail")
    public ResponseEntity<String> sendTemperatureAlertEmail(@RequestBody TemperatureAlertRequest request)
    {
        eventservice.sendTemperatureAlertEmail(request.getThreshold());
        // Use the threshold from the request
        return ResponseEntity.status(HttpStatus.OK).body("Temperature alert email sent successfully!");
    }
    //POST requests with temperature alert data
    //it sends an email alert based on the provided temperature threshold and returns a success message.
}


