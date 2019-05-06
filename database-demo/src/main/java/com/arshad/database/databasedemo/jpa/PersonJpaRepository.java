package com.arshad.database.databasedemo.jpa;

import com.arshad.database.databasedemo.entity.Person;
import org.springframework.stereotype.Repository;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

@Repository
@Transactional
public class PersonJpaRepository {

    //connect to the database
    @PersistenceContext
    EntityManager entityManager;
    
    public List<Person> findAll() {
    	TypedQuery<Person> namedQuery = entityManager.createNamedQuery("find_all_persons", Person.class);
    	return namedQuery.getResultList();
    }

    public Person findById(int id) {
        return entityManager.find(Person.class, id);
    }

    public Person update(Person person) {
        return entityManager.merge(person);
    }

    public Person insert(Person person) {
        return entityManager.merge(person);
    }
    
    public void deleteById(int id) {
    	Person person = findById(id);
    	entityManager.remove(person);
    }

}
