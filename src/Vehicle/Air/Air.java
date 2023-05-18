package src.Vehicle.Air;

import src.Vehicle.Vehicle;

/**
 * Air
 */
public class Air extends Vehicle{

    private final Integer wheelsQuantity;

    public Air(String code, String name, String color, Double height, Double width, Double velocity, Integer wheelsQuantity) {
        super(code, name, color, height, width, velocity);
        this.wheelsQuantity = wheelsQuantity;
    }

    /**
     * @return the wheelsQuantity
     */
    public Integer getWheelsQuantity() {
        return wheelsQuantity;
    }

//    public Air(String code, String name, String color, Double height, Double width, Double velocity, Integer wheelsQuantity) {

    public String toString() {
        return super.toString() + ";" + this.wheelsQuantity;
    }
}