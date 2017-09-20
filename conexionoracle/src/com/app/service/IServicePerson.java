package com.app.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.app.modelo.Contacto;

/**
 * The Interface IServicePerson.
 */
public interface IServicePerson {
	
	/**
	 * Gets the information all persons.
	 *
	 * @return the information all persons
	 */
	public ArrayList<Contacto> getInformationAllPersons();
	
	/**
	 * Gets the contact.
	 *
	 * @param id the id
	 * @return the contact
	 */
	public Contacto getContact(String id);
	
	/**
	 * Gets the contact by id.
	 *
	 * @param id the id
	 * @return the contact by id
	 */
	public ArrayList<Contacto> getContactById(String id);
	
	/**
	 * Save contact.
	 *
	 * @param contact the contact
	 * @return true, if successful
	 * @throws SQLException 
	 */
	public boolean saveContact(Contacto contact) throws SQLException;

}
