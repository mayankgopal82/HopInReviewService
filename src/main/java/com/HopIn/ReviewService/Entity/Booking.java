//package com.HopIn.ReviewService.Entity;
//
//import jakarta.persistence.*;
//import lombok.AllArgsConstructor;
//import lombok.Builder;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//
//import java.time.LocalDateTime;
//
//@Entity
//@Builder
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//public class Booking extends BaseClass {
//
//    @Enumerated(EnumType.STRING)
//    private BookingStatus bookingStatus;
//
//    private LocalDateTime startDate;
//
//    private LocalDateTime endDate;
//
//    private Double totalDistance;
//
//    @ManyToOne
//    private Driver driver;
//
//    @ManyToOne
//    private Passenger passenger;
//
//}
