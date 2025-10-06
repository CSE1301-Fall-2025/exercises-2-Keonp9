package module4._01text;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class E01Stats {

	/*
	 * Exercise: The below code reads in a series of doubles from a file and prints them.
	 * Modify this code to find the maximum, minimum, average, and count of the values
	 * read in from the file.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		//Code for setting up Scanner with a file
		//Not your responsibility to understand this part!
		JFileChooser chooser = new JFileChooser("datafiles");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		int sum = 0;
		int count = 0;
		
		
		//Using scanner to read from a file
		//Modify and add to the code below
		//to complete the exercise
		while(in.hasNextDouble()) {
			System.out.println(in.nextDouble());
			sum += in.nextDouble();
			count++;
		}
		System.out.print("Average: " + (sum/count));
	}
}
