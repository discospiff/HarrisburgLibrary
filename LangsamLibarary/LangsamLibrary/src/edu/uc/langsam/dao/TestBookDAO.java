package edu.uc.langsam.dao;

import java.util.List;

import org.junit.Test;

import edu.uc.langsam.dto.LibraryItem;
import junit.framework.TestCase;

public class TestBookDAO extends TestCase {

	private IBookDAO bookDAO;

	@Test
	public void testInsertAndFetch() throws Exception {
		givenBookDAOIsCreated();
		whenInsertCharlieAndTheChocolateFactory();
		thenVerifyAtLeastOneResultWithChocolate();
	}

	private void givenBookDAOIsCreated() {
		// TODO Auto-generated method stub
		bookDAO = new BookDAO();
		
	}

	private void thenVerifyAtLeastOneResultWithChocolate() {
		List<LibraryItem> books = bookDAO.fetch("Chocolate");
		assertTrue(books.size() > 0);
	}

	private void whenInsertCharlieAndTheChocolateFactory() throws Exception {
		LibraryItem libraryItem = new LibraryItem();
		libraryItem.setItemNumber(1000);
		libraryItem.setStatus("Checked In");
		libraryItem.setTitle("Charlie and the Chocolate Factory");
		libraryItem.setType("Book");
		bookDAO.insertOrUpdate(libraryItem);
		
	}
	
}
