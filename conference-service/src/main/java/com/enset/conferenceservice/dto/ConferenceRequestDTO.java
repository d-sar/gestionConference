package com.enset.conferenceservice.dto;



import com.enset.conferenceservice.entities.TypeConference;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConferenceRequestDTO {

    @NotBlank(message = "Le titre est obligatoire")
    @Size(min = 3, max = 200, message = "Le titre doit contenir entre 3 et 200 caractères")
    private String titre;

    @NotNull(message = "Le type est obligatoire")
    private TypeConference type;

    @NotNull(message = "La date est obligatoire")
    @FutureOrPresent(message = "La date doit être présente ou future")
    private LocalDate date;

    @NotNull(message = "La durée est obligatoire")
    @Min(value = 15, message = "La durée minimale est de 15 minutes")
    @Max(value = 480, message = "La durée maximale est de 480 minutes")
    private int duree;

    @NotNull(message = "Le nombre d'inscrits est obligatoire")
    @Min(value = 0, message = "Le nombre d'inscrits doit être positif")
    private int nombreInscrits;

    @NotNull(message = "L'identifiant du keynote est obligatoire")
    private Long keynoteId;
}
