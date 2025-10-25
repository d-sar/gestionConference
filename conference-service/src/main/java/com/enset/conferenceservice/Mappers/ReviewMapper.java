package com.enset.conferenceservice.Mappers;

import com.enset.conferenceservice.dto.ReviewDTO;
import com.enset.conferenceservice.dto.ReviewRequestDTO;
import com.enset.conferenceservice.entities.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReviewMapper {

    @Mapping(source = "conference.id", target = "conferenceId")
    ReviewDTO toDTO(Review review);

    List<ReviewDTO> toDTOList(List<Review> reviews);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "conference", ignore = true)
    Review toEntity(ReviewRequestDTO dto);
}
