package com.HopIn.ReviewService.Entity;


import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class PassengerReview extends Review {

    private Double PassengerRating;
    private String PassengerReviewComment;
}
