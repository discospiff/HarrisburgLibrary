package edu.uc.langsam.dao;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import edu.uc.langsam.dto.LibraryItem;
import edu.uc.langsam.dto.User;

public class UserDAO implements IUserDAO {

	public Map<User, HashSet<LibraryItem>> users;
	
	public UserDAO() {
		users = new HashMap<User, HashSet<LibraryItem>>();
	}
	
	@Override
	public void checkOut(LibraryItem libraryItem, User user) throws Exception {
		HashSet<LibraryItem> checkedOutItems = users.get(user);
		if (checkedOutItems == null) {
			checkedOutItems = new HashSet<LibraryItem>();
			checkedOutItems.add(libraryItem);
			users.put(user, checkedOutItems);
			
		} else if(checkedOutItems.contains(libraryItem)) {
			throw new Exception("The user has already checked out this item.");
			 
		} else {
			checkedOutItems.add(libraryItem);
		}

	}

	@Override
	public void checkIn(LibraryItem libraryItem, User user) throws Exception {
		HashSet<LibraryItem> checkedOutItems = users.get(user);
		if (checkedOutItems == null) {
			throw new Exception("The user does not have any items on loan.");
			
		} else if(checkedOutItems.contains(libraryItem)) {
			checkedOutItems.remove(libraryItem);
			 
		} else {
			throw new Exception("The user has not checked out this item.");
		}

	}
	
	@Override
	public Map<User, HashSet<LibraryItem>> fetchAll() {
		return users;
	}
	
	@Override
	public Set<LibraryItem> fetchItemsCheckedOutByUser(User user) {
		return users.get(user);
	}

}
