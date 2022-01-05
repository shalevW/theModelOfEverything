package src.livingBeings.multiCelled.plants;

import java.util.Random;

import src.livingBeings.LivingBeing;
import src.livingBeings.cells.singularCelled.eukrayota.Eukrayotes;
import src.tools.celularEnums.Reproduction;
import src.tools.plantEnums.Flowers;
import src.tools.plantEnums.Fruit;
import src.tools.plantEnums.Leaves;
import src.tools.plantEnums.Roots;
import src.tools.plantEnums.Seeds;
import src.tools.plantEnums.Sun;

public class Plants extends LivingBeing {
    
    protected Eukrayotes eukrayotes;
    protected Reproduction reproduction;
    protected Leaves leaves;
    protected Flowers flowers;
    protected Seeds seeds;
    protected Fruit fruit;
    protected Roots roots;
    protected int sun;
    



    public void photosynthesis(){
        if(getSun() < 1){
            System.out.println("You have sun!");
            System.out.println("Have a good meal");
            System.out.println("You have made some Oxygen bi-oxyde out of Carbon mono-oxyde");
            System.out.println("...");
            System.out.println(" ");
        } else {
            phototropysm();
        }
    }

    public void phototropysm(){
        
            System.out.println("You have no sun!");
            System.out.println("Better send Auxin hormones to the cells furthest from light");
            System.out.println("The Auxin will make them elongate and make your stem turn towards the light");
            System.out.println("...");
            System.out.println(" ");
            
        
    }

    public int getSun() {
        Random random = new Random();
        return random.nextInt(2);
    }

}
