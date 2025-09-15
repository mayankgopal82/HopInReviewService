package com.HopIn.ReviewService.Controller;

import com.HopIn.ReviewService.DTO.ResponseDTO;
import com.HopIn.ReviewService.DTO.ReviewDTO;
import com.HopIn.ReviewService.Entity.Review;
import com.HopIn.ReviewService.Repositories.ReviewRepository;
import com.HopIn.ReviewService.Service.ReviewService;
import com.HopIn.ReviewService.Service.ReviewServiceImpl;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class ReviewController {

    @Autowired
    ReviewServiceImpl reviewServiceImpl;

    @PostMapping("/review")
    public ResponseEntity<ResponseDTO> postReview(@Valid @RequestBody ReviewDTO dto) throws Exception {

        ResponseDTO response = reviewServiceImpl.postReview(dto);
        return ResponseEntity.status(201).body(response);
    }
}git
