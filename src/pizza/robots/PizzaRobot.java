package pizza.robots;

import pizza.interfaces.ICutTool;

public class PizzaRobot {
    public ICutTool iCutTool;

    public PizzaRobot(ICutTool iCutTool){
        this.iCutTool = iCutTool;
    }
    public void cutPizza(){
        this.iCutTool.cut();
    }

}
