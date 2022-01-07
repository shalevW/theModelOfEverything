package industry.plantBased.millery;

public class ShippingPort extends Millery {


    public int shipFlour() {
        System.out.println("Loading flour onto trucks");
        System.out.println("Flour is loaded");
        System.out.println("Off it goes");
        return flourStored--;
    }
}
