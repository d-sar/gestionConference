package com.enset.keynoteservice;

import com.enset.keynoteservice.entities.Keynote;
import com.enset.keynoteservice.repo.KeynoteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KeynoteServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeynoteServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(KeynoteRepository keynoteRepository) {
        return args -> {
            keynoteRepository.save(Keynote.builder()
                            .nom("sara")
                            .prenom("sara")
                            .email("sara@gmail.com")
                            .fonction("ing")
                    .build());
            keynoteRepository.save(Keynote.builder()
                    .nom("hamza")
                    .prenom("hamza")
                    .email("hamza@gmail.com")
                    .fonction("ing")
                    .build());
            keynoteRepository.save(Keynote.builder()
                    .nom("fatima")
                    .prenom("fatima")
                    .email("fatima@gmail.com")
                    .fonction("medc")
                    .build());
        };
    }

}
