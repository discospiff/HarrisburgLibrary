package edu.uc.langsam.service;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import edu.uc.langsam.dto.LibraryItem;
import edu.uc.langsam.dto.User;

/**
 * Business logic for library class.
 * @author Win7
 *
 */
public interface ILibraryService {
	
	/**
	 * Add a new Library Item.
	 * @param libraryItem
	 * @throws Exception
	 */
	public void add(LibraryItem libraryItem) throws Exception;
	/**
	 * Check in a LibraryItem for a user.
	 * @param libraryItem
	 * @param user
	 * @throws Exception
	 */
	public void checkIn(LibraryItem libraryItem, User user) throws Exception;
	/**
	 * Check out a LibraryItem for a user.
	 * @param libraryItem
	 * @param user
	 * @throws Exception
	 */
	public void checkOut(LibraryItem libraryItem, User user) throws Exception;
	/**
	 * Get an individual LibraryItem
	 * @param key
	 * @return
	 * @throws Exception
	 */
	public List<LibraryItem> checkStatus(String key) throws Exception;
	/**
	 * Show all users in the system.
	 * @return
	 */
	Set<User> showAllUsers();
	/**
	 * Show all LibraryItems in the system.
	 * @return
	 */
	List<LibraryItem> showAllItems();
 
}
