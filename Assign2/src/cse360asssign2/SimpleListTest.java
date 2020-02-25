package cse360asssign2;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class SimpleListTest 
{

	@Test
	void test() 
	{
		
		SimpleList testList = new SimpleList();
		assertNotNull(testList);
	}
	
	@Test
	public void testAdd1() 
	{
		SimpleList testList = new SimpleList();
		
		
		testList.add(5);
		testList.add(4);
		testList.add(3);
		
		assertEquals(3, testList.count());
		
		System.out.println(testList.toString());
		System.out.println(testList.count());
	}
	
	/**
	 * This test case tests if the an element is added to the beginning
	 * in addition to extending the list if it is full.
	 */
	@Test
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
		
		
		System.out.println("Before adding the new element: ");
		System.out.println(testList.toString());
		System.out.println("Count: " + testList.count());
		
		testList.add(11);
		testList.add(28);
		testList.add(30);
		
		System.out.println("After adding the new element: ");
		System.out.println(testList.toString());
		System.out.println("Count: " + testList.count());
		
		assertEquals(13, testList.count());
	}
	

	@Test
	/**
	 * Adding 21 elements to test a second 50% increase
	 */
	public void add3()
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
		
		System.out.println("Count: " + testList.count());
		System.out.println(testList.toString());
	
		assertEquals(21, testList.count());
	}
	
	@Test
	/*
	 * Counts the number of elements in the list
	 * including empty spots
	 */
	public void elementCount()
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
		
		
		
	}
}
