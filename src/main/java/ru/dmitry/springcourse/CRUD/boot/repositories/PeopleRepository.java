package ru.dmitry.springcourse.CRUD.boot.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.dmitry.springcourse.CRUD.boot.model.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
