package edu.uc.langsam.dao;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import edu.uc.langsam.dto.LibraryItem;
import edu.uc.langsam.dto.User;

/**
 * In memory data access layer for users.
 * This does not use any permanent/persistent storage.
 * @author Win7
 *
 */
public interface IUserDAO {
	/**
	 * Add this library item to the user's checked out list.
	 * @param libraryItem
	 * @param user
	 * @throws Exception
	 */
	public void checkOut(LibraryItem libraryItem, User user) throws Exception;
	/**
	 * Remove this libary item from the user's checked out list.
	 * @param libraryItem
	 * @param user
	 * @throws Exception
	 */
	public void checkIn(LibraryItem libraryItem, User user) throws Exception;
	/**
	 * Get all users and their checked out items.
	 * @return
	 */
	Map<User, HashSet<LibraryItem>> fetchAll();
	/**
	 * Return a list of items checked out by a user.
	 * @param user
	 * @return
	 */
	Set<LibraryItem> fetchItemsCheckedOutByUser(User user);
}
