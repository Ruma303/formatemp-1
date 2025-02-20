package Secondo;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		String name;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Come ti chiami?");
		name = scanner.nextLine();
		
		System.out.println("Piacere di conoscerti " + name);
		scanner.close();
	}
}
