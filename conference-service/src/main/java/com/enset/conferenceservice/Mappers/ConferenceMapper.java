package com.enset.conferenceservice.Mappers;

import com.enset.conferenceservice.dto.ConferenceDTO;
import com.enset.conferenceservice.dto.ConferenceRequestDTO;
import com.enset.conferenceservice.entities.Conference;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring", uses = {ReviewMapper.class})
public interface ConferenceMapper {

    ConferenceDTO toDTO(Conference conference);

    List<ConferenceDTO> toDTOList(List<Conference> conferences);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "score", ignore = true)
    @Mapping(target = "reviews", ignore = true)
    @Mapping(target = "keynote", ignore = true)
    Conference toEntity(ConferenceRequestDTO dto);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "score", ignore = true)
    @Mapping(target = "reviews", ignore = true)
    @Mapping(target = "keynote", ignore = true)
    void updateEntityFromDTO(ConferenceRequestDTO dto, @MappingTarget Conference conference);
}
