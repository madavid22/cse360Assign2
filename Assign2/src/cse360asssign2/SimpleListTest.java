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
		
		System.out.println("-----------------------");
		System.out.println("Test Case: testAdd1()");
		System.out.println("-----------------------");
		System.out.println(testList.toString());
		System.out.println();
		
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
		
		System.out.println("-----------------------");
		System.out.println("Test Case: testAdd2():");
		System.out.println("-----------------------");
		System.out.println("Before adding the new element: ");
		System.out.println(testList.toString() + "\n");
		
		testList.add(11);
		testList.add(28);
		testList.add(30);
		
		
		System.out.println("After adding the new element: ");
		System.out.println(testList.toString());
		System.out.println();
		
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
		
		System.out.println("-----------------------");
		System.out.println("Test Case: testAdd3(): ");
		System.out.println("-----------------------");
		System.out.println("Count: " + testList.count());
		System.out.println(testList.toString());
	
		System.out.println();
		assertEquals(35, testList.count());
	}
	
	@Test
	/**
	 * Removes an a single element in the list and prints the
	 * resulting list afterwards.
	 */
	public void removeTest1()
	{
		SimpleList testList = new SimpleList();
		System.out.println("-------------------------");
		System.out.println("Test Case: removeTest1():");
		System.out.println("-------------------------");
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
		
		System.out.println("Before Removing: " + testList.toString() + "\n");
		
		assertEquals(10, testList.count());
		
		testList.remove(0);
		
		assertEquals(9, testList.count());
		
		System.out.println("After Removing: " + testList.toString() + "\n");
	}
	
	@Test
	/**
	 *  Allocate 17 filled spaces, remove an element
	 * 	and the size of the list should retain at 20.
	 */
	public void removeTest2()
	{
		SimpleList testList = new SimpleList();
		
		System.out.println("-------------------------");
		System.out.println("Test Case: removeTest2():");
		System.out.println("-------------------------");
		
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
		
		testList.add(72);
		testList.add(20);
		testList.add(10);
		testList.add(26);
		testList.add(11);
		testList.add(5);
		testList.add(4);
		
		assertEquals(17, testList.count());
		
		testList.remove(0);
		
		assertEquals(16, testList.count());
		
		System.out.println(testList.toString());
		System.out.println();

	}
	
	@Test
	/**
	 * Take 12 elements, remove an element, and the
	 * size of the list should decrease to 15.
	 * 
	 */
	public void removeTest3()
	{
		SimpleList testList = new SimpleList();
		
		System.out.println("-------------------------");
		System.out.println("Test Case: removeTest3():");
		System.out.println("-------------------------");
		
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
		
		testList.add(72);
		testList.add(252);
		
		assertEquals(12, testList.count());
		
		testList.remove(0);
		
		assertEquals(11, testList.count());
		
		System.out.println(testList.toString() + "\n");
		
	}
	
	@Test
	/*
	 * Take a list of 10, add 2 elements, and keep removing
	 * and adding an element until the size decreases to a 
	 * single element (i.e. list size = 1). After that, keep adding 
	 * an element to the list until the size increases to 16. After 
	 * that, remove an element and maintain the size at 16.
	 * Show the resulting list using toString();
	 */
	public void removeTest4()
	{
		SimpleList testList = new SimpleList();
		
		System.out.println("-------------------------");
		System.out.println("Test Case: removeTest4():");
		System.out.println("-------------------------");
		
		testList.add(34);
		
		assertEquals(1, testList.count());
		
		testList.add(6);
		
		testList.remove(34);

		testList.add(72);
		
		
		testList.remove(72);
		
		testList.add(10);
		
		testList.remove(6);
		
		testList.add(8);
		
		testList.remove(10);
		
		testList.add(3);
		
		testList.remove(8);
		
		testList.add(6);
		testList.add(7);
		testList.add(8);
		testList.add(9);
		testList.add(0);
		testList.add(41);
		testList.add(0);
		testList.add(13);
		testList.add(24);
		testList.add(2);
		
		testList.remove(0);
		
		System.out.println(testList.toString());
		System.out.println("# of elements: " + testList.count());
		
		assertEquals(10, testList.count());
		
		
	}
	
}
