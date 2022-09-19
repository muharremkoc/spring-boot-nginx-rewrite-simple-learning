package com.example.springbootnginxrewrite.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PeopleRequestDto {

    String firstName;

    String lastName;
}
