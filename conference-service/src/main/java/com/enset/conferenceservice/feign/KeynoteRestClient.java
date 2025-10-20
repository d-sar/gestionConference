package com.enset.conferenceservice.feign;

import com.enset.conferenceservice.model.Keynote;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient("keynote-service")
public interface KeynoteRestClient {
    @GetMapping("keynotes/{id}")
    Keynote getKeynoteById(Long id);
    @GetMapping("/keynotes")
    List<Keynote> getAllKeynotes();
}
