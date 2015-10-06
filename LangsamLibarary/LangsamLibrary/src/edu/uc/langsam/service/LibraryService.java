package edu.uc.langsam.service;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.uc.langsam.dao.IBookDAO;
import edu.uc.langsam.dao.IUserDAO;
import edu.uc.langsam.dto.LibraryItem;
import edu.uc.langsam.dto.User;

public class LibraryService implements ILibraryService {

	IBookDAO bookDAO;
	IUserDAO userDAO;
	
	@Override
	public void add(LibraryItem libraryItem) throws Exception {
		// TODO Auto-generated method stub
		bookDAO.insertOrUpdate(libraryItem);
	}

	@Override
	public void checkIn(LibraryItem libraryItem, User user) throws Exception {
		libraryItem.setStatus(LibraryItem.CHECKED_IN);
		userDAO.checkIn(libraryItem, user);
		
	}

	@Override
	public void checkOut(LibraryItem libraryItem, User user) throws Exception {
		libraryItem.setStatus(LibraryItem.CHECKED_OUT);
		userDAO.checkOut(libraryItem, user);
	}

	@Override
	public List<LibraryItem> checkStatus(String key) throws Exception {
		// TODO Auto-generated method stub
		return bookDAO.fetch(key);
	}
	
	@Override
	public List<LibraryItem> showAllItems() {
		return bookDAO.fetchAll();
	}

	@Override
	public Set<User> showAllUsers() {
		Map<User, HashSet<LibraryItem>> users = userDAO.fetchAll();
		return users.keySet();
	}
	
}
