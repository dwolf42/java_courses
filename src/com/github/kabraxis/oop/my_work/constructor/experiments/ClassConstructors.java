package com.github.kabraxis.oop.my_work.constructor.experiments;
public class ClassConstructors {
    public static void main(String[] args) {
        String title = "Book of books";
        int yearOfPublishing = 2022;
        String[] authors = {"Kabraxis", "J.K. Rowling", "Anderzej Sapkowski"};
        Book book = new Book(title, yearOfPublishing, authors);

        System.out.println("Title: " + book.title);
        System.out.println("Year of Publishing: " + book.yearOfPublishing);
        System.out.printf("Authors: %s, %s, %s", book.authors[0], book.authors[1], book.authors[2]);
    }
}





