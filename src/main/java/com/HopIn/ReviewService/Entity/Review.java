package com.HopIn.ReviewService.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseClass  {

//    @OneToOne
//    @JoinColumn(nullable = false)
//    @NotNull
//    @NotEmpty
//    private Booking booking;
//
//    private String content;
//
//    @Column(nullable = false)
//    @NotNull
//    @NotEmpty
//    private Double rating;
//
//    @ManyToOne
//    @NotNull
//    @NotEmpty
//    private Driver driver;
//
//    @ManyToOne
//    @NotNull
//    @NotEmpty
//    private Passenger passenger;

    @NotNull
    @NotEmpty
    private String booking_id;

    private String content;

    @NotNull
    private Double rating;

    @NotNull
    private Long driver_id;

    @NotNull
    private Long passenger_id;

}
