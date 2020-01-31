package Exercises.ComparatorEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sorting {

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();

        books.add(new Book("Albert Camus","title1",223));
        books.add(new Book("Z","title3",33));
        books.add(new Book("Heidegger","Being and time",891));
        books.add(new Book("Michio Kaku","Quantuum physics",34));

        List<Book> reversedBooks = new ArrayList<Book>(books);

        Collections.sort(books);
        Collections.sort(reversedBooks, new BookComparator().reversed());

        System.out.println("This list was sorted by 'Comparable': " + books);
        System.out.println("This list was sorted by 'Comparator': " + reversedBooks);

    }

}
