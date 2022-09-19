package com.example.springbootnginxrewrite.repository;

import com.example.springbootnginxrewrite.model.People;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeopleRepository extends JpaRepository<People,String> {


}
