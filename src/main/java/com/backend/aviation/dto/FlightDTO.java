package com.backend.aviation.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@Builder
public class FlightDTO {

    private String id;

    @NotBlank
    @Size(min = 2, max = 100)
    private String name;

    @NotBlank
    @Size(min = 2, max = 100)
    private String lastname;


    private String flightId;

    @NotBlank
    @Size(min = 2, max = 100)
    private String airline;

    @NotBlank
    @Size(min = 2, max = 100)
    private String origin;

    @NotBlank
    @Size(min = 2, max = 100)
    private String destination;


}
