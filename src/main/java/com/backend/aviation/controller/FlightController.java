package com.backend.aviation.controller;

import com.backend.aviation.dto.FlightDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @GetMapping("/{flightId}")
    public String getFlightDetails(@PathVariable String flightId) {
        return "Flight details for ID " + flightId;
    }

    @PostMapping
    public String addNewFlight(@RequestBody FlightDTO flightDTO) {
        return "New flight added: " + flightDTO.toString();
    }

    @PutMapping("/{flightId}")
    public String updateFlightDetails(@PathVariable String flightId, @RequestBody FlightDTO flightDTO) {
        return "Flight details updated for ID " + flightId + ": " + flightDTO.toString();
    }

    @DeleteMapping("/{flightId}")
    public String deleteFlight(@PathVariable String flightId) {
        return "Flight deleted for ID " + flightId;
    }
}

