package com.HopIn.ReviewService.Entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;
import java.util.Date;


@Data
@Entity
@Table(name="Booking_Review")
public class Review {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int bookingId;

    private String content;

    @Column(nullable = false)
    private Double rating;

    @CreatedDate
    @Column(nullable = false)
    private LocalDateTime createdDate;

    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime lastModified;

}
