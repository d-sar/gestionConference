package com.enset.conferenceservice.entities;
import com.enset.conferenceservice.model.Keynote;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Entity
@NoArgsConstructor @AllArgsConstructor @Getter @Setter @Builder
public class Conference {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String titre;
    private TypeConference type;
    private Date date;
    private int duration;
    private int nombreInscrit;
    private int score ;
    @OneToMany(mappedBy = "conference")
    private List<Review> reviews=new ArrayList<>();
    @Transient Keynote keynote;
}
