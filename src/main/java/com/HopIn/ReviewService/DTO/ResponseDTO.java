package com.HopIn.ReviewService.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

    private Long reviewId;
    private String bookingId;
    private String content;
    private Double rating;
    private Long driverID;
    private Long passengerId;

}
