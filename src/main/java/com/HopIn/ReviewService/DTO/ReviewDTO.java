package com.HopIn.ReviewService.DTO;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ReviewDTO {

    @NotNull
    @NotEmpty
    private String bookingId;

    private String content;

    @NotNull
    private Double rating;

    @NotNull
    private Long driverId;

    @NotNull
    private Long passengerId;


}
