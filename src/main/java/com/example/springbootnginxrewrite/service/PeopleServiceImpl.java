package com.example.springbootnginxrewrite.service;

import com.example.springbootnginxrewrite.dto.PeopleRequestDto;
import com.example.springbootnginxrewrite.model.People;
import com.example.springbootnginxrewrite.repository.PeopleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PeopleServiceImpl implements PeopleService{

    final PeopleRepository peopleRepository;

    @Override
    public People create(PeopleRequestDto peopleRequestDto) {
        People people= People.builder()
                .firstName(peopleRequestDto.getFirstName())
                .lastName(peopleRequestDto.getLastName()).build();

        return peopleRepository.save(people);
    }

    @Override
    public People update(String id, PeopleRequestDto peopleRequestDto) {
        People currentPeople=peopleRepository.findById(id).get();
           currentPeople.setFirstName(peopleRequestDto.getFirstName());
           currentPeople.setLastName(peopleRequestDto.getLastName());
        return peopleRepository.save(currentPeople);
    }

    @Override
    public void delete(String id) {
        peopleRepository.deleteById(id);
    }

    @Override
    public List<People> listPeople() {
        return peopleRepository.findAll();
    }

    @Override
    public People get(String id) {
        return peopleRepository.findById(id).get();
    }
}
