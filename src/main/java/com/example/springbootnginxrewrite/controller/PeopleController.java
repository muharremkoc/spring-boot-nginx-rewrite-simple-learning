package com.example.springbootnginxrewrite.controller;

import com.example.springbootnginxrewrite.dto.PeopleRequestDto;
import com.example.springbootnginxrewrite.model.People;
import com.example.springbootnginxrewrite.service.PeopleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api-nginx/version/1")
public class PeopleController {

    final PeopleService peopleService;

    @PostMapping("/people")
   public People createPeople(@RequestBody PeopleRequestDto peopleRequestDto){
        return peopleService.create(peopleRequestDto);
    }

    @PutMapping("/people/{id}")
   public People updatePeople(@PathVariable("id")String id,PeopleRequestDto peopleRequestDto){
        return peopleService.update(id, peopleRequestDto);
    }
    @DeleteMapping("/people/{id}")
    void deletePeople(@PathVariable("id")String id){
        peopleService.delete(id);
    }

    @GetMapping("/peoples")
    public List<People> peopleList(){
        return peopleService.listPeople();
    }

    @GetMapping("/people/{id}")
    public People getPeople(@PathVariable("id")String id){
        return peopleService.get(id);
    }
}
