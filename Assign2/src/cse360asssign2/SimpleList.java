/**
 * @author Marquell David
 * Class ID: 199
 * Assignment 2
 * 
 * This is a SimpleList class that will
 * add, remove, search, print, and count the
 * elements of a size 10 list.
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
	  *
	  * @param newElement	the element to add to the list 
	  */
	 
	 public void add(int newElement) 
	 {
		 
		 int currentLength = list.length;
		 
		 if(currentLength > 0)
			 
		 {
			 /*
			  * This loop will iterate through the list
			  * and shift elements if the list was already full
			  */
			 
			 if(currentLength >= 10)
			 {
				 int[] tempList = new int[currentLength * 2];
				 
				 // Copying the contents of the list to a temporary list 
				 for(int inner = 0; inner < currentLength; inner++)
				 {
					 tempList[inner] = list[inner];
				 }
				 
				 // Overwriting the list with a 50% increase in length
				 list = new int[currentLength * 2];
				 
				 // copying the contents of the temporary list back into the main list
				 for(int copyIndex = 0; copyIndex < currentLength; copyIndex++)
				 {
					 list[copyIndex] = tempList[copyIndex];
				 }
				 
				 for(int index = currentLength - 1; index > 0; index--)
				 {
					 list[index] = list[index - 1];
				 }
				
			 }
			 
			 else
			 {
				 for(int index = currentLength - 1; index > 0; index--)
				 {
					list[index + 1] = list[index]; 
				 }
			 } 
			 
		 list[0] = newElement;
		 
		 count++; 
	 }
}
	 
	 
	 /**
	  * This method utilizes the search method
	  * to find a particular element to remove.
	  * The elements will be shifted and count will 
	  * be adjusted accordingly.
	  * 
	  * @param deleteElement	the element to delete from the list
	  */

	 public void remove(int deleteElement)
	 {
		 
		 int removeIndex = search(deleteElement);
		 
		 
		 if(removeIndex != -1)
		 {
			 for(int index = removeIndex; index < count - 1; index++)
			 {
				 list[index] = list[index + 1];
			 }
			 count--;
			 System.out.println("Removed element " + deleteElement + ".");
			 
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
			 displayString = "";
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
	 

}
