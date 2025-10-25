package com.enset.conferenceservice.dto;

import com.enset.conferenceservice.entities.TypeConference;
import com.enset.conferenceservice.model.Keynote;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConferenceDTO {

    private Long id;
    private String titre;
    private TypeConference type;
    private LocalDate date;
    private Integer duree;
    private Integer nombreInscrits;
    private Double score;
    private Long keynoteId;
    private Keynote keynote;
    private List<ReviewDTO> reviews;
}