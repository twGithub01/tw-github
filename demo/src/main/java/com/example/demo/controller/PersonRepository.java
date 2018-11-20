package com.example.demo.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.conf.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {
	Person findByName(String name); 
	Person findByNameAndAge(String name, int age); 
	@Query("FROM Person p WHERE p.id=:id") 
	Person findPersonById(@Param("id") Long id);
	
}
