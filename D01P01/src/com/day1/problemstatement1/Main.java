package com.day1.problemstatement1;

import java.util.Scanner;

import javax.swing.JOptionPane;
public class Main {
	    public static void main(String[] args) {
	    	int num = Integer.parseInt(JOptionPane.showInputDialog("Enter any number equal to or between 1-12 to display the month"));
			
	        //System.out.print("Enter the number of books: ");
	        int numBooks = scanner.nextInt();

	        // Create an array to store Book objects
	        Book[] books = createBooks(numBooks);

	        // Display the books along with their description
	        showBooks(books);
	        }

		private static void showBooks(Book[] books) {
			// TODO Auto-generated method stub
			System.out.println("Book Title\tPrice");
		    for (Book book : books) {
		        System.out.println(book.getBook_title() + "\tRs." + book.getBook_price());
		    }
		}

		private static Book[] createBooks(int n) {
			// TODO Auto-generated method stub
			Scanner scanner = new Scanner(System.in);
		    Book[] books = new Book[n];
		    for (int i = 0; i < n; i++) {
		        Book book = new Book();
		        System.out.print("Enter book title: ");
		        String title = scanner.next();
		        book.setBook_title(title);
		        System.out.print("Enter book price: ");
		        double price = scanner.nextDouble();
		        book.setBook_price(price);
		        books[i] = book;
		    }
		    return books;
		}
}
