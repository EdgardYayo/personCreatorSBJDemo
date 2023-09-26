package dev.edy.demApp.dao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dev.edy.demApp.model.Person;

@Repository("postgres")
public class PersonDataAccessService implements PersonDao {


    // private final JdbcTemplate jdbcTemplate;

    // @Autowired
    // public PersonDataAccessService(JdbcTemplate jdbcTemplate) {
    //     this.jdbcTemplate = jdbcTemplate;
    // }

    @Override
    public int insertPerson(UUID id, Person person) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insertPerson'");
    }

    @Override
    public List<Person> selectAllPeople() {
        // final String sql = "SELECT id, name FROM person";
        // List<Person> persons = jdbcTemplate.query(sql, (resultSet, i) -> {
        //     UUID id = UUID.fromString(resultSet.getString("id"));
        //     String name = resultSet.getString("name");
        //     return new Person(id,name);
        // });
        // return persons
        return List.of(new Person(UUID.randomUUID(), "FROM POSTGRESQL DB"));
    }

    @Override
    public Optional<Person> selectPersonById(UUID id) {
        // final String sql = "SELECT id, name FROM person WHERE id = ?";
        //  Person person = jdbcTemplate.queryForObject(sql, new Object[]{id}, (resultSet, i) -> {
        //     UUID personId = UUID.fromString(resultSet.getString("id"));
        //     String name = resultSet.getString("name");
        //     return new Person(personId,name);
        // });
        //  return Optional.orNullable(person);
        throw new UnsupportedOperationException("Unimplemented method 'deletePersonById'");
    }

    @Override
    public int deletePersonById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePersonById'");
    }

    @Override
    public int updatePersonById(UUID id, Person person) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updatePersonById'");
    }
    
}
