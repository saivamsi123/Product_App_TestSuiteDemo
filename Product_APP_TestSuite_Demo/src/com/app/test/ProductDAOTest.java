/**
 * 
 */
package com.app.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.app.demo.Product;
import com.dao.demo.ProductDAO;

/**
 * @author Allianz3075
 *
 */
public class ProductDAOTest {

	/**
	 * Test method for {@link com.dao.demo.ProductDAO#ProductDAO()}.
	 */
	@Test
	public final void testProductDAO() {
		System.out.println("TestProductDAO initialised");// TODO
	}

	/**
	 * Test method for {@link com.dao.demo.ProductDAO#save(com.app.demo.Product)}.
	 */
	@Test
	public final void testSave() {
		ProductDAO product = new ProductDAO();
		Product pro = new Product(10, "Laptop", "Software", 10000);
		pro = product.save(pro);
		assertNotNull(pro); // TODO
	}

	/**
	 * Test method for {@link com.dao.demo.ProductDAO#delete(com.app.demo.Product)}.
	 */
	@Test
	public final void testDelete() {
		ProductDAO pro = new ProductDAO();
		Product product = new Product();
		pro.delete(product); // TODO
	}

}
