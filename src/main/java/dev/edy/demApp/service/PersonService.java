package dev.edy.demApp.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import dev.edy.demApp.dao.PersonDao;
import dev.edy.demApp.model.Person;

@Service
public class PersonService {
    
    private final PersonDao personDao;

    /* IF WE NEED TO CHANGE OUR DATABASE WE JUST NEED TO SIMPLE CHANGE
     * @Qualifier("fakeDao") FOR @Qualifier("postgres") THAT POINT TO OUR REPOSITORY
     */

    @Autowired
    public PersonService(@Qualifier("fakeDao") PersonDao personDao){
        this.personDao = personDao;
    }

    public int addPerson(Person person){
        return personDao.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return personDao.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id) {
        return personDao.selectPersonById(id);
    }

    public int deletePerson(UUID id) {
        return personDao.deletePersonById(id);
    }

    public int updatePerson(UUID id, Person newPerson) {
        return personDao.updatePersonById(id, newPerson);
    }
}
