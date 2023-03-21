package veriYapilari;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		String[] numbers = { " ", " ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi girin: ");
		String inputNumber = scan.nextLine();
		char[] digits = inputNumber.toCharArray(); // char[0]=6 , char[1]=3 char[2]=2

		LinkedList list = new LinkedList();
		for (int i = 0; i < digits.length; i++)
			list.add(numbers[digits[i] - 48]);

		Combination combination = new Combination();
		combination.combinate("", list.root);
	}
}