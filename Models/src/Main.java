package src;

import src.livingBeings.multiCelled.plants.Chickpea;

public class Main {
    public static void main(String[] args) {
     
        Chickpea hummus = new Chickpea();
        
        for(int i = 0; i < 30; i++) {
            System.out.println(i);
            hummus.photosynthesis();}
    }
    
}
