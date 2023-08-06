package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean Code", 500);
        Book book2 = new Book("Harry Potter", 600);
        Book book3 = new Book("Незнайка на луне", 400);
        Book book4 = new Book("Head First: Java", 500);
        Book[] bookShelf = {book1, book2, book3, book4};
        for (int i = 0; i < bookShelf.length; i++) {
            System.out.println(bookShelf[i].getName() + " "  + bookShelf[i].getPageCount());
        }
        System.out.println("---After replacing 0 and 3 book---");
        Book temp = bookShelf[0];
        bookShelf[0] = bookShelf[3];
        bookShelf[3] = temp;
        for (int i = 0; i < bookShelf.length; i++) {
            System.out.println(bookShelf[i].getName() + " "  + bookShelf[i].getPageCount());
        }

        System.out.println("---Searching book with name---");
        for (int i = 0; i < bookShelf.length; i++) {
            if (bookShelf[i].getName().equals("Clean Code")) {
                System.out.println(bookShelf[i].getName() + " " + bookShelf[i].getPageCount());
            }
        }
    }
}
