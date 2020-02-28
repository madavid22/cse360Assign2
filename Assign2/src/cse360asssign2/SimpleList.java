/**
 * @author Marquell David
 * Class ID: 199
 * Assignment 2
 * 
 * Version 2:
 * This is a SimpleList class that will
 * add, remove, search, print, and count the
 * elements of an initial list of size 10.
 * The size of the list will be allocated 50% of 
 * space, or reduced 25% of space depending on
 * the current condition of the list. The list also
 * has an append(int) method that adds the element 
 * to the end of the list. The user will also be able
 * to find the first element as well as the size of 
 * possible locations on the list. A user can also find the 
 * first and last element of the list.
 */

package cse360asssign2;

public class SimpleList 
{
	 private int[] list;
	 private int count;
	 
	 
	 /**
	  * This is the constructor for the 
	  * SimpleList class
	  */
	 
	 public SimpleList() 
	 {
		 
		 list = new int[10];
		 count = 0;
	 }
	 
	 
	 /**
	  * Places newElement in the first index of 
	  * the lists and shifts all other elements forward. 
	  * Increases the size of the list 50% if the list is full.
	  *
	  * @param newElement	the element to add to the list 
	  */
	 
	 public void add(int newElement) 
	 {
		 
		 int currentLength = list.length;
		 
		 if(currentLength > 0)	 
		 {
			 if(count >= currentLength)
			 {
				 /**
				  *  Creating a temporary list 50% larger
				  *  if the list was already full, and copying
				  *  the list array into it
				  */
				 
				 int[] tempList = new int[list.length * 2];
				 
				 for(int index = 0; index < list.length; index++)
				 {
					 tempList[index] = list[index];
				 }
				 
				 /*
				  * Allocating 50% more memory to a new list
				  * and copying the tempList back into the main list
				  */
				 
				 list = new int[tempList.length];
				 
				 for(int index = 0; index < tempList.length; index++)
				 {
					 list[index] = tempList[index];
				 }
				 
			 }
			
			 /*
			  * This loop will iterate through 
			  * the list and shift elements 
			  */ 
			 
			 for(int index = count; index > 0; index--)
			 {
				 
				 list[index] = list[index - 1];
				 
			 }
			 
		 }
		 
		 list[0] = newElement;
		 
		 count++; 
		
	 }

	 
	 /**
	  * This method utilizes the search method
	  * to find a specified element to remove.
	  * The elements will be shifted and count will 
	  * be adjusted accordingly. In addition,
	  * the size will decrease 25% iff the number of
	  * empty spaces exceeds 25%.
	  * 
	  * @param deleteElement	the element to delete from the list
	  */

	 public void remove(int deleteElement)
	 {
		 
		 int removeIndex = search(deleteElement);
		 
		 
		 int[] tempList = new int[(list.length * 3) / 4];
		 
	
		 if(removeIndex != -1)
		 {
			 for(int index = removeIndex; index < count - 1 ; index++)
			 {
				 list[index] = list[index + 1];
			 }
			
			 count--;
			 
			 
			 if(count <= (list.length * 3) / 4 && list.length >= 1)	
			 {
				
				 /**
				  * Copying elements in the list to a temporary
				  * list prior to deducting 25%.
				  */
				 for(int index = 0; index < tempList.length; index++)
				 {
					 tempList[index] = list[index];
				 }
				 
				 list = tempList;
			 }
			
		 }
		 
		 else
		 {
			 System.out.println(deleteElement + " does not exist.");
			 
		 }
		 
	 }
	 
	 
	 /**
	  * 
	  * Returns the number of elements in the array by 
	  * the count variable.
	  * 
	  * @return count		the number of elements in the list
	  */
	 
	 public int count()
	 {
		 
		 return count;
		 
	 }
	 
	 
	 /**
	  * Prints all the elements in
	  * the list and separates them by a space
	  */
	 
	 public String toString()
	 {

		 String displayString = "";
		 
		 if(count != 0)
		 {
			 for(int index = 0; index < count; index++)
			 {
				 if(index != list.length - 1)
				 {
					 displayString += list[index] + " ";
				 }
				 else
				 {
					 displayString += list[index]; 
				 }
			 }
		 }
		 else
		 {
			 displayString = "The list is empty.";
		 }
		
		 
		 return displayString;
		
	 }
	 
	 
	 /**
	  * 
	  * This method will take an integer as a parameter 
	  * representing the element they want to find. An iteration
	  * will be used through the list to locate the element 
	  * and return the location.
	 
	  * 
	  * @param findElement		the element to be searched for
	  * @return location		the index the element is located in					
	  */
	 
	 public int search(int findElement)
	 {
		
		 int location = -1;
		 
		 for(int index = 0; index < count; index++)
		 {
			 if(list[index] == findElement)
			 {
				 location = index;
				 return location;
			 }
		 }
		 
		 return location;
	 }
	 
	 /**
	  * 
	  * @param appendElement	the element to be appended to the end
	  */
	 public void append(int appendElement)
	 {
		 int currentLength = list.length;
		 
		 if(currentLength > 0)
		 {
			 if(count >= currentLength)
			 {
				 /**
				  * Copy the elements in a temporary list with a 
				  * length of 50% increase
				  */
				 int[] tempList = new int[currentLength * 2];
				 
				 for(int index = 0; index < list.length; index++)
				 {
					 tempList[index] = list[index]; 
				 }
				 
				 list = new int[tempList.length];
				 
				 for(int index = 0; index < list.length; index++)
				 {
					 list[index] = tempList[index];
				 }
				 
			 }
		 }
		 
		 list[count] = appendElement;
		 count++;
		 
	 }
	 
	 /**
	  * 
	  * @return	firstElement	the first element in the list
	  */
	 public int first()
	 {
		 int firstElement = -1;
		 
		 if(count != 0)
		 {
			 firstElement = list[0];
		 }
				 
		 return firstElement;
	 }
	 
	 /**
	  * 
	  * @return	lastElement		the last element in the list
	  */
	 public int last()
	 {
		 int lastElement = -1;
		 
		 if(count != 0)
		 {
			 lastElement = list[count - 1];
		 }
				 
		 return lastElement;
	 }
	 
	 /**
	  * 
	  * @return possible			the size of the possible locations in the list
	  */
	 public int size()
	 {
		 return list.length;
	 }
}