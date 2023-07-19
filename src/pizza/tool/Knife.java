package pizza.tool;

import pizza.interfaces.ICutTool;

public class Knife implements ICutTool {
    @Override
    public void cut() {
        System.out.println("Item cutPizza, with knife");
    }
}
