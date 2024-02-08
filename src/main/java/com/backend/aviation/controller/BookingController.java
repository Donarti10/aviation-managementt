package com.backend.aviation.controller;

import com.backend.aviation.dto.BookingDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @PostMapping
    public ResponseEntity<Void> createBooking(@RequestBody BookingDTO bookingDTO) {
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookingDTO> getBookingById(@PathVariable String id) {
        BookingDTO booking = null;

        if (booking != null) {
            return ResponseEntity.ok(booking);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
