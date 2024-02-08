package com.backend.aviation.controller;

import com.backend.aviation.dto.PassengerDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/passengers")
public class PassengerController {

    @PostMapping
    public ResponseEntity<Void> createPassenger(@RequestBody PassengerDTO passengerDTO) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PassengerDTO> getPassengerById(@PathVariable String id) {
        PassengerDTO passenger = null;

        if (passenger != null) {
            return ResponseEntity.ok(passenger);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}