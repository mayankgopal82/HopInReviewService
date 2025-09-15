package com.HopIn.ReviewService.Service;

import com.HopIn.ReviewService.DTO.ResponseDTO;
import com.HopIn.ReviewService.DTO.ReviewDTO;
import com.HopIn.ReviewService.Entity.Review;

public interface ReviewService {

//    Review getReview(Long id);
    ResponseDTO postReview(ReviewDTO review) throws Exception;
//    Review deleteReview(Long id);
//    Review updateReview(Long id);

}
