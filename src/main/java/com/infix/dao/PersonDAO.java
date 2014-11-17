/**
 * 
 */
package com.infix.dao;

import java.util.List;

import com.infix.model.Person;

/**
 * @author reazpatwary
 *
 */
public interface PersonDAO {
	public void addPerson(Person p);
    public void updatePerson(Person p);
    public List<Person> listPersons();
    public Person getPersonById(int id);
    public void removePerson(int id);
}

