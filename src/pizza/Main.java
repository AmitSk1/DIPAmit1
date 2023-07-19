package pizza;

import pizza.interfaces.ICutTool;
import pizza.robots.PizzaRobot;
import pizza.tool.Knife;
import pizza.tool.Laser;

public class Main {
    public static void main(String[] args) {

        ICutTool iCutTool = new Laser();
        PizzaRobot pizzaRobot = new PizzaRobot(iCutTool);
        pizzaRobot.cutPizza();

    }


}
