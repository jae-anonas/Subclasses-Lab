package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Marsupial koala = new Marsupial(4,25, "Koko", 200, false, true);
        Snake cobra = new Snake(40, "King Cob", false, 7, true);
        Bear bear = new Bear(4, 40, "Yogi", 700, false, false);
        Lizard lizard = new Lizard(4,"Lizzie", false,true, true);

        System.out.println("For the koala (Marsupial):");
        System.out.println("Name: " + koala.getName());
        System.out.println("Number of legs: " + koala.getNumLegs());
        System.out.println("Hair per sq. inch: " + koala.getHairPerSqInch());
        System.out.println("Top speed: " + koala.getTopSpeed());
        System.out.println("Has a pouch: " + koala.hasPouch());

        System.out.println();

        System.out.println("For the cobra (Snake):");
        System.out.println("Name: " + cobra.getName());
        System.out.println("Number of legs: " + cobra.getNumLegs());
        System.out.println("Length: " + cobra.getLength());
        System.out.println("Is egg-laying: " + cobra.isEggLaying());
        System.out.println("Top speed: " + cobra.getTopSpeed());
        System.out.println("Is endangered: " + cobra.isEndangered());

        System.out.println();

        System.out.println("For the bear (Bear):");
        System.out.println("Name: " + bear.getName());
        System.out.println("Number of legs: " + bear.getNumLegs());
        System.out.println("Is polar: " + bear.isPolar());
        System.out.println("Hair per sq. inch: " + bear.getHairPerSqInch());
        System.out.println("Top speed: " + bear.getTopSpeed());
        System.out.println("Is endangered: " + bear.isEndangered());

        System.out.println();

        System.out.println("For the lizard (Lizard):");
        System.out.println("Name: " + lizard.getName());
        System.out.println("Number of legs: " + lizard.getNumLegs());
        System.out.println("Can stick on walls: " + lizard.canStickOnWalls());
        System.out.println("Is egg-laying: " + lizard.isEggLaying());
        System.out.println("Top speed: " + lizard.getTopSpeed());
        System.out.println("Is endangered: " + lizard.isEndangered());
    }
}
