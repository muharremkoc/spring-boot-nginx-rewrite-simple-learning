package com.example.springbootnginxrewrite.service;

import com.example.springbootnginxrewrite.dto.PeopleRequestDto;
import com.example.springbootnginxrewrite.model.People;

import java.util.List;

public interface PeopleService {

    People create(PeopleRequestDto peopleRequestDto);
    People update(String id,PeopleRequestDto peopleRequestDto);
    void delete(String id);
    List<People> listPeople();
    People get(String id);
}
