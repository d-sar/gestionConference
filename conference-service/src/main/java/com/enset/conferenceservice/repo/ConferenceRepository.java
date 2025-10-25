package com.enset.conferenceservice.repo;

import com.enset.conferenceservice.entities.Conference;
import com.enset.conferenceservice.entities.TypeConference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ConferenceRepository extends JpaRepository<Conference, Long> {
    List<Conference> findByConferenceName(String conferenceName);

    List<Conference> findByKeynoteId(Long keynoteId);

    List<Conference> findByType(TypeConference type);

    List<Conference> findByDateBetween(LocalDate startDate, LocalDate endDate);

    @Query("SELECT c FROM Conference c WHERE c.score >= :minScore")
    List<Conference> findByScoreGreaterThanEqual(Double minScore);

}
