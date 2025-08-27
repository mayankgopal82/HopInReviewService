package com.HopIn.ReviewService.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Review extends BaseClass  {

    private String content;

    @Column(nullable = false)
    private Double rating;

    @ManyToOne
    private Driver driver;
    
    @ManyToOne
    private Passenger passenger;
}
