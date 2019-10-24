package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.transaction.NotSupportedException;

@RestController
@RequestMapping("/bookings")
public class BookController {
    @Autowired
    private BookingService bookingService;

    @ResponseStatus(code = HttpStatus.CREATED)
    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Book saveParkingLot(@RequestBody Book bookingInfo) {
        return bookingService.saveParkingLot(bookingInfo);
    }
}