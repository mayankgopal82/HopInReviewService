package com.HopIn.ReviewService.Service;

import com.HopIn.ReviewService.Client.BookingClient;
import com.HopIn.ReviewService.DTO.ResponseDTO;
import com.HopIn.ReviewService.DTO.ReviewDTO;
import com.HopIn.ReviewService.Entity.BookingStatus;
import com.HopIn.ReviewService.Entity.Review;
import com.HopIn.ReviewService.Repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    BookingClient bookingClient;


    @Override
    public ResponseDTO postReview(ReviewDTO reviewDTO) throws Exception {

        if(reviewRepository.existsByBookingId(reviewDTO.getBookingId())){
            throw new Exception("Booking Already Exists");
        }
        //a rest call the booking service api to check if the booking id exists or not
        if(!bookingClient.checkBookingExists(reviewDTO.getBookingId())){
            throw new Exception();
        }
        //rest call to check whether the booking status is completed or not
        BookingStatus bookingStatus=bookingClient.checkBookingStatus(reviewDTO.getBookingId());
        if(!(bookingStatus==BookingStatus.COMPLETED)){
            throw new Exception();
        }
        //here we will map the incoming request reviewDTO after all validations and checks
        //to review entity and persist it
        Review review = Review.builder().bookingId(reviewDTO.getBookingId()).content(reviewDTO.getContent())
                .rating(reviewDTO.getRating()).driverId(reviewDTO.getDriverId()).passengerId(reviewDTO.getPassengerId()).build();

     Review reviewResponse=  reviewRepository.save(review);

     return ResponseDTO.builder().bookingId(reviewDTO.getBookingId()).content(reviewDTO.getContent())
             .rating(reviewDTO.getRating()).driverID(reviewDTO.getDriverId()).passengerId(reviewDTO.getPassengerId()).
             reviewId(reviewResponse.getId()).build();
    }

}
