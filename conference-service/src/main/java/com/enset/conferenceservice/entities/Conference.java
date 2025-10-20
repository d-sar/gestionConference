package com.enset.conferenceservice.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.enset.conferenceservice.model.Keynote;
import jakarta.persistence.*;
import lombok.*;


@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Conference {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private TypeDeConference type;
    private Date date ;
    private int duree;
    private int nombreInscrits;
    private int score;
    @OneToMany(mappedBy = "conference")
    private List<Review> reviews=new ArrayList<>();
    @Transient private Keynote keynote;

}
