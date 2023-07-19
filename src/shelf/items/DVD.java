package shelf.items;

import shelf.intefaces.IReviews;
import shelf.intefaces.ISample;

public class DVD extends Items implements IReviews, ISample {

    public String name;

    public DVD(String name) {
        this.name = name;
    }

    @Override
    public void seeReviews() {

    }

    @Override
    public void readSample() {

    }
}
