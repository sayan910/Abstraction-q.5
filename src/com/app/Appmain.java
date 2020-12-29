package com.app;
import java.util.Scanner;
import com.model.Magazine;

public class Appmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the ISBN Number:");
		int isbnNumber=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the Book Name:");
		String bookName=sc.nextLine();
		System.out.println("Enter the price:");
		double price=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the magazine Type:");
		String magazineType=sc.nextLine();
		Magazine magazine=new Magazine(isbnNumber, bookName, price, magazineType);
		System.out.println("ISBN Number-"+ magazine.getISBNNumber());
		System.out.println("Discount Amount-"+magazine.calculateDiscount());

	}

}
