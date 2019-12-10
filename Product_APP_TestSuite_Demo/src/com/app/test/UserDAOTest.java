/**
 * 
 */
package com.app.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.app.demo.User;
import com.dao.demo.UserDAO;

/**
 * @author Allianz3075
 *
 */
public class UserDAOTest {

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.dao.demo.UserDAO#UserDAO()}.
	 */
	@Test
	public final void testUserDAO() {
		System.out.println("TestUserDAO initialised"); // TODO
	}

	/**
	 * Test method for {@link com.dao.demo.UserDAO#saveUser(com.app.demo.User)}.
	 */
	@Test
	public final void testSaveUser() {
		UserDAO user = new UserDAO();
		User us = new User(100, "SharathChandra", "Trivandrum", "9010203040");
		us = user.saveUser(us);
		assertNotNull(us);// TODO
	}

	/**
	 * Test method for {@link com.dao.demo.UserDAO#deleteUser(com.app.demo.User)}.
	 */
	@Test
	public final void testDeleteUser() {
		UserDAO user = new UserDAO();
		User use = new User();
		user.deleteUser(use);// TODO
	}

}
