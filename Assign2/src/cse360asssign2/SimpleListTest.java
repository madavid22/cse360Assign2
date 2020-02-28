package cse360asssign2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class SimpleListTest 
{

	@Test
	/**
	 * A test case for testing the constructor
	 * of SimpleList
	 */
	void test() 
	{
		
		SimpleList testList = new SimpleList();
		assertNotNull(testList);
	}
	
	@Test
	/**
	 * Add 3 elements to the list an ensure 
	 * the count is 3.
	 */
	public void testAdd1() 
	{
		SimpleList testList = new SimpleList();
		
		
		testList.add(5);
		testList.add(4);
		testList.add(3);
		
		assertEquals(3, testList.count());
		
	}
	
	
	@Test
	/**
	 * This test case tests if the an element is added to the beginning
	 * in addition to extending the list if it is full.
	 */
	public void testAdd2()
	{
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(10);
		testList.add(11);
		testList.add(28);
		testList.add(30);
		
		
		
		assertEquals("30 28 11 10 9 8 7 6 5 4 3 2 1 ", testList.toString());
		
		assertEquals(13, testList.count());
	}
	

	@Test
	/**
	 * Adding 21 elements to test a second 50% increase
	 * The resulting list should be at a size of 40
	 */
	public void testAdd3()
	{
		SimpleList testList = new SimpleList();
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(10);
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(10);
		testList.add(21);
		testList.add(1);
		testList.add(2);
		testList.add(3);
		testList.add(4);
		testList.add(5);
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(31);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(31);
		
		assertEquals(35, testList.count());
		assertEquals(40, testList.size());
	}
	
	@Test
	/**
	 * Removes an a single element in the list and prints the
	 * resulting list afterwards.
	 */
	public void removeTest1()
	{
		SimpleList testList = new SimpleList();
		
		testList.add(34);
		testList.add(4);
		testList.add(6);
		testList.add(78);
		testList.add(12);
		testList.add(0);
		testList.add(89);
		testList.add(13);
		testList.add(21);
		testList.add(9);
		
		
		
		assertEquals(10, testList.count());
		
		testList.remove(0);
		
		assertEquals(9, testList.count());
		
		assertEquals("9 21 13 89 12 78 6 4 34 ", testList.toString());
	}
	
	@Test
	/**
	 *  Allocate 5 filled spaces, remove an element, 
	 *  and the size of the list should reduce to 7.
	 */
	public void removeTest2()
	{
		SimpleList testList = new SimpleList();
		
		testList.add(34);
		testList.add(4);
		testList.add(6);
		testList.add(78);
		testList.add(12);
		
		
		testList.remove(34);
		
		assertEquals(7, testList.size());
		assertEquals(4, testList.count());

	}
	
	@Test
	/**
	 * Allocate 11 elements to the list.
	 * Remove 1.
	 * Confirm the list is size 15.
	 * Add an element. 
	 * The list is still 15.
	 * Append 5 elements.
	 * The list size should be 30.
	 * The count should be 16.
	 * Get the first element.
	 * Get the last element.
	 */
	public void overall()
	{
		SimpleList testList = new SimpleList();
		testList.add(34);
		testList.add(4);
		testList.add(6);
		testList.add(78);
		testList.add(12);
		testList.add(34);
		testList.add(4);
		testList.add(6);
		testList.add(78);
		testList.add(12);
		testList.add(12);
		
		testList.remove(78);
		assertEquals(15, testList.size());
		
		testList.add(2);
		assertEquals(15, testList.size());
		testList.append(34);
		testList.append(4);
		testList.append(6);
		testList.append(78);
		testList.append(78);
		
		assertEquals(30, testList.size());
		assertEquals(16, testList.count());
		
		assertEquals(2, testList.first());
		assertEquals(78, testList.last());
		
		
	}
}	