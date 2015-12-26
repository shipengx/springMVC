package com.shipeng.spring.dao;

import java.util.List;
import com.shipeng.spring.model.*;

public interface ContactDAO {

	public void saveOrUpdate(Contact contact);
	public void delete(int contactId);
	public Contact get(int contactId);
	public List<Contact> list();
}
