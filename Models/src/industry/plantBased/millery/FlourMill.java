package industry.plantBased.millery;

public class FlourMill extends Millery {
    


    public int mill(int sivSize) {
        for (int i = sivSize; i > 0; i--){
        System.out.println("Shaking the grain");
        System.out.println("Grain and Bran are seperated");
        System.out.println("Sifting through siv" + i);
        if (i > 5) {
            System.out.println("You have coarse Semolina");
            System.out.println("The bran in the semolina is sifted by fans from below");
            System.out.println("It is lighter than flour so it rises");
            System.out.println("The Semolina is moved to a finer mill");
        } 
        else if (i > 2) {
            System.out.println("You have fine Semolina");
            System.out.println("The bran in the semolina is sifted by fans from below");
            System.out.println("It is lighter than flour so it rises");
            System.out.println("The Semolina is moved to a finer mill");
        } 
        else if (i == 1){
                System.out.println("You have Flour");
            }
        }
        return (this.flourStored++) + (this.grainAvailable--);
    }
    
}
