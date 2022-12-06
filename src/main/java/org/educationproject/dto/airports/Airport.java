package org.educationproject.dto.airports;

import lombok.Data;

import java.time.ZonedDateTime;

@Data
public class Airport {
    String city;
    String country;
    ZonedDateTime zonedDateTime;

}
