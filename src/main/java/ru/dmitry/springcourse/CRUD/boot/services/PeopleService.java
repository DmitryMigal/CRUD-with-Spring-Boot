package ru.dmitry.springcourse.CRUD.boot.services;

import org.springframework.stereotype.Service;
import ru.dmitry.springcourse.CRUD.boot.model.Person;

import java.util.List;

@Service
public interface PeopleService {
    List<Person> findAll();

    Person findOne(int id);

    void save(Person person);

    void update(int id, Person updatePerson);

    void delete(int id);


}
