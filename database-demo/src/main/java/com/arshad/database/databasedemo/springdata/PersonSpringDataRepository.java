package com.arshad.database.databasedemo.springdata;
import org.springframework.data.jpa.repository.JpaRepository;

import com.arshad.database.databasedemo.entity.Person;

public interface PersonSpringDataRepository extends JpaRepository<Person, Integer> {

}
