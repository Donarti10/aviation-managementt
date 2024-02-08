package com.backend.aviation.controller;

import com.backend.aviation.dto.AirportDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/airports")
public class AirportController {

    @PostMapping
    public ResponseEntity<Void> createAirport(@RequestBody AirportDTO airportDTO) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{code}")
    public ResponseEntity<AirportDTO> getAirportByCode(@PathVariable String code) {
        AirportDTO airport = null;

        if (airport != null) {
            return ResponseEntity.ok(airport);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}