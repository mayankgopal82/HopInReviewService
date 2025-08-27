package com.HopIn.ReviewService.Entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Driver extends BaseClass{

    private String name;

    @Column(nullable = false)
    private long licenseNumber;

    @OneToMany
    private List<Review> reviews;

    @OneToMany
    private List<Booking> booking;


}
