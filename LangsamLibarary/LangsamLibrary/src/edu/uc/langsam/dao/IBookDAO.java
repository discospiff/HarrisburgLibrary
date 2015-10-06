package edu.uc.langsam.dao;

import java.util.ArrayList;
import java.util.List;

import edu.uc.langsam.dto.LibraryItem;

/**
 * In memory data access layer for books. 
 * This does not use any long term (persistent) storage.
 * @author Win7
 *
 */
public interface IBookDAO {
	
	/**
	 * Insert a new book, or update an existing one.
	 * @param libraryItem
	 * @throws Exception
	 */
	public void insertOrUpdate(LibraryItem libraryItem) throws Exception;
	
	/**
	 * Fetch any book where the title contains the parameter.  It does not need to be an exact match.
	 * @param title
	 * @return
	 */
	public List<LibraryItem> fetch(String title);
	
	/**
	 * Return all books.
	 * @return
	 */
	List<LibraryItem> fetchAll();
}
