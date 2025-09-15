-- BaseClass fields will be included in each table that extends it

CREATE TABLE booking (
    id BIGSERIAL PRIMARY KEY,
    created_date TIMESTAMP NOT NULL,
    last_modified TIMESTAMP NOT NULL,
    review_id BIGINT,
    booking_status VARCHAR(255),
    start_date TIMESTAMP,
    end_date TIMESTAMP,
    total_distance DOUBLE,
    driver_id BIGINT,
    passenger_id BIGINT,
    CONSTRAINT fk_booking_review FOREIGN KEY (review_id) REFERENCES review(id),
    CONSTRAINT fk_booking_driver FOREIGN KEY (driver_id) REFERENCES driver(id),
    CONSTRAINT fk_booking_passenger FOREIGN KEY (passenger_id) REFERENCES passenger(id)
);

CREATE TABLE driver (
    id BIGSERIAL PRIMARY KEY,
    created_date TIMESTAMP NOT NULL,
    last_modified TIMESTAMP NOT NULL,
    name VARCHAR(255),
    license_number BIGINT NOT NULL
);

CREATE TABLE passenger (
    id BIGSERIAL PRIMARY KEY,
    created_date TIMESTAMP NOT NULL,
    last_modified TIMESTAMP NOT NULL,
    name VARCHAR(255)
);

CREATE TABLE review (
    id BIGSERIAL PRIMARY KEY,
    created_date TIMESTAMP NOT NULL,
    last_modified TIMESTAMP NOT NULL,
    content VARCHAR(255),
    rating DOUBLE PRECISION NOT NULL,
    driver_id BIGINT,
    passenger_id BIGINT,
    CONSTRAINT fk_review_driver FOREIGN KEY (driver_id) REFERENCES driver(id),
    CONSTRAINT fk_review_passenger FOREIGN KEY (passenger_id) REFERENCES passenger(id)
);

-- Since Review is the base for PassengerReview (InheritanceType.JOINED),
-- PassengerReview will have its own table, with a FK to review.id
CREATE TABLE passenger_review (
    id BIGINT PRIMARY KEY,
    passenger_rating DOUBLE PRECISION,
    passenger_review_comment VARCHAR(255),
    CONSTRAINT fk_passenger_review_review FOREIGN KEY (id) REFERENCES review(id)
);
