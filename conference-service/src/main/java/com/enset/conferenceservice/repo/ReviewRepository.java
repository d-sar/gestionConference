package com.enset.conferenceservice.repo;

import com.enset.conferenceservice.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
    List<Review> findByConferenceId(Long conferenceId);

    @Query("SELECT AVG(r.note) FROM Review r WHERE r.conference.id = :conferenceId")
    Double calculateAverageNoteByConferenceId(Long conferenceId);

}
