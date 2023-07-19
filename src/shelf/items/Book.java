package shelf.items;

import shelf.intefaces.IReviews;
import shelf.intefaces.ISample;

public class Book extends Items implements IReviews, ISample {
    public String name;

    public Book(String name) {
        this.name = name;
    }

    @Override
    public void seeReviews() {
        System.out.printf("");
    }

    @Override
    public void readSample() {
        System.out.printf("");
    }
}
