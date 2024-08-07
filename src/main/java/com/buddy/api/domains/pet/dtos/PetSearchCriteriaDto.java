package com.buddy.api.domains.pet.dtos;

import com.buddy.api.domains.shelter.dtos.ShelterCompactDto;
import java.time.LocalDate;
import java.util.List;
import java.util.UUID;

public record PetSearchCriteriaDto(UUID id,
                                   UUID shelterId,
                                   String name,
                                   String avatar,
                                   String specie,
                                   String gender,
                                   LocalDate birthDate,
                                   String location,
                                   Double weight,
                                   String description,
                                   ShelterCompactDto shelterCompactDto,
                                   List<PetImageDto> images) {
}
