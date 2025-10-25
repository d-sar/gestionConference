package com.enset.conferenceservice.clientFeign;

import com.enset.conferenceservice.model.Keynote;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "keynote-service")
public interface KeynoteRestClient {

    @GetMapping("/api/keynotes/{id}")
    Keynote getKeynoteById(@PathVariable Long id);

    @GetMapping("/api/keynotes")
    List<Keynote> getAllKeynotes();



}
