package shelf;

import shelf.items.Book;
import shelf.items.DVD;
import shelf.items.Items;
import shelf.items.Shirt;
import shelf.shelfs.DigitalShelf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Items> items = new ArrayList<Items>(Arrays.asList(new Book("amit, book "),
                new DVD("amit dvd"),
                new Shirt("amit, shirt")));
        DigitalShelf digitalShelf = new DigitalShelf(items);

        digitalShelf.addItem();

    }
}
