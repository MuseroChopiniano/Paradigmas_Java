package ar.edu.uai.paradigms.service;

import ar.edu.uai.model.person.Person;
import ar.edu.uai.model.person.PersonCriteria;

import java.util.List;


public interface PersonService {

    Person savePerson(Person person);

    Person retrievePerson(Integer identifier);

    void deletePerson(Integer identifier);

    Person updatePerson(Person person);
    Person agregarHijo(Integer padreID,Person hijo);
    List<Person> retrieveByCriteria(PersonCriteria criteria);
}
