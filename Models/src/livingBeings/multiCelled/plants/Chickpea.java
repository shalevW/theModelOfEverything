package src.livingBeings.multiCelled.plants;

import src.tools.celularEnums.Reproduction;
import src.tools.plantEnums.Flowers;
import src.tools.plantEnums.Fruit;
import src.tools.plantEnums.Leaves;
import src.tools.plantEnums.Seeds;

public class Chickpea extends Plants {
    
    public Chickpea() {
        this.leaves = Leaves.LEAFLETS;
        this.flowers = Flowers.WHITE;
        this.reproduction = Reproduction.SEXUAL;
        this.fruit = Fruit.LEGUME;
        this.seeds = Seeds.LEGUME;



    }
}
