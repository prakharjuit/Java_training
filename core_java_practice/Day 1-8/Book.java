package wiprodemo;

import java.util.Scanner;

public class Book {
    String title;
    String author;
    int year;

    void setBook(String t, String a, int y) {
        title = t;
        author = a;
        year = y;
    }

    void showBook() {
        System.out.println("Title: " + title + ", Author: " + author + ", Year: " + year);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Book b1 = new Book();
        Book b2 = new Book();

        System.out.println("Enter details for Book 1:");
        System.out.print("Title: ");
        String title1 = sc.nextLine();
        System.out.print("Author: ");
        String author1 = sc.nextLine();
        System.out.print("Year: ");
        int year1 = sc.nextInt();
        sc.nextLine(); // consume newline

        b1.setBook(title1, author1, year1);

        System.out.println("\nEnter details for Book 2:");
        System.out.print("Title: ");
        String title2 = sc.nextLine();
        System.out.print("Author: ");
        String author2 = sc.nextLine();
        System.out.print("Year: ");
        int year2 = sc.nextInt();

        b2.setBook(title2, author2, year2);

        System.out.println("\nBook Details:");
        b1.showBook();
        b2.showBook();

        sc.close();
    }
}
