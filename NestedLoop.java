/****************************************
*
* Student Name: Corey Barron
* Date Due:11:59
* Date Submitted:11:59
* Program Name:Homework 5
* Program Description:Coin Flip
*
*
****************************************/

public class NestedLoop {
	
	public static void printCross(int size, char display){
		
		    for (int row = 0; row < size; row++){
		        for (int col = 0; col < size; col++){
		            if (row == col || row + col == size - 1){
		                System.out.print(display);
		            }else{
		                System.out.print(" ");
		            	 }
		        	}
		      System.out.println();
		}
	}
}
