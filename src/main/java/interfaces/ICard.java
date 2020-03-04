package interfaces;

import classes.Map;

public interface ICard extends Comparable<ICard>{

    /**
     * Set what robot the card should interact with
     * @param robot target robot
     */
    void setRobot(IRobot robot);

    /**
     * do the action specified by the card
     */
    void doAction(Map map);

    int getPriority();
}
