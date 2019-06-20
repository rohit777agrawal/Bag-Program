/*
Program about Bag.
Author: Rohit Agrawal
E-mail Address: ra2381@email.vccs.edu
Programming Project 1.
Last Changed: September 28, 2018.
*/

import java.util.Scanner;
public class BagDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// helps to get user input
		Scanner keyboard = new Scanner(System.in);
		
		// object myBag ->-> using default constructor
		Bag myBag = new Bag();
		int option = 0; // variable option ->-> data type ->-> integer
		
		do
		{
			System.out.println("Press 1 to change the name of bag \n"
					+ "Press 2 to add an item to the bag \n"
					+ "Press 3 to change the maximum weight of the bag \n"
					+ "Press 4 to view all information about the bag \n"
					+ "Press 5 to end the program \n");
			
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if (option == 1) // change name ->-> using method setName();
			{
				System.out.println("What is the name of the bag?");
				String newName = keyboard.nextLine();
				myBag.setName(newName);
			}
			else if (option == 2) // change current weight ->-> using method addItem(parameter);
			{
				System.out.println("What is the weight of the item that you want to add in bag?");
				double newWeight = keyboard.nextDouble();
				myBag.addItem(newWeight);
			}
			else if (option == 3) // change maximum weight ->-> using method setMaximumWeight(parameter);
			{
				System.out.println("What is the new maximum weight that your bag could carry?");
				double newMaximumWeight = keyboard.nextDouble();
				myBag.setMaximumWeight(newMaximumWeight);
			}
			else if (option == 4) // display name ->-> getName(),current weight ->-> getCurrentWeight(),maximum weight ->-> getMaximumWeight()
			{
				System.out.println("The name of the bag is " + myBag.getName() + "\n" + 
						"the current weight of the bag is " + myBag.getCurrentWeight() + "\n" +
						"the maximum weight of the bag is " + myBag.getMaximumWeight());
			}
			else if (option == 5) // End program ->-> do while loop ends ->-> while(False)
			{
				System.out.println("Goodbye.");
			}
			else // Did not choose any option ->-> try once again
			{
				System.out.println("Error!");
			}
			
		}while(option != 5); // loop is true unless user choose ->-> 5
		
		keyboard.close();
	}

}
