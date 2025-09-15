package com.HopIn.ReviewService.Client;

import com.HopIn.ReviewService.Entity.BookingStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class BookingClient {

    @Autowired
    RestTemplate restTemplate;

    @Value("{BOOKING_SERVICE_URL}")
    private String baseUrl;

    @Value("{CHECK_STATUS_URL}")
    private String checkStatusUrl;

    public Boolean checkBookingExists(String bookingId) {
//        ResponseEntity<Boolean> response = restTemplate.
//                exchange(baseUrl+"/{id}/exists",
//                        HttpMethod.GET,
//                        HttpEntity.EMPTY,
//                        Boolean.class,bookingId);

//        return response.getBody();
        return true;
    }
    public BookingStatus checkBookingStatus(String bookingId){

//       ResponseEntity<BookingStatus> response = restTemplate.exchange(baseUrl+checkStatusUrl,
//               HttpMethod.GET,HttpEntity.EMPTY,BookingStatus.class);

//       return response.getBody();
        return BookingStatus.COMPLETED;
    }
}
