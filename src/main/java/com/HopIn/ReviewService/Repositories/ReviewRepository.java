package com.HopIn.ReviewService.Repositories;

import com.HopIn.ReviewService.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ReviewRepository extends JpaRepository<Review,Long> {
//Optional<List<Review>> findByDriverId(Long id);
//Optional<List<Review>> findByDriverIdIn(List<Long> ids);
Integer countAllByRatingLessThan(Double rating);

List<Review> findAllByCreatedDateBefore(LocalDateTime dateTime);

ad
}
