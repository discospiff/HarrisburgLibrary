package edu.uc.langsam.dao;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import edu.uc.langsam.dto.LibraryItem;

public class BookDAO implements IBookDAO {
	
	private Set<LibraryItem> allItems;
	
	public BookDAO() {
		allItems = new HashSet<LibraryItem>();
	}

	@Override
	public void insertOrUpdate(LibraryItem libraryItem) throws Exception {
		allItems.add(libraryItem);

	}

	@Override
	public List<LibraryItem> fetch(String title) {
		// 
		return null;
	}
	
	@Override
	public List<LibraryItem> fetchAll() {
		return new ArrayList<LibraryItem>(allItems);
	}

}
