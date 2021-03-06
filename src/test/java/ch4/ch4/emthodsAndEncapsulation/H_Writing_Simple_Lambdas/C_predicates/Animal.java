package ch4.ch4.emthodsAndEncapsulation.H_Writing_Simple_Lambdas.C_predicates;

/*
 * Created by: Cristian Arroyo
 * on 29 March 2018 - 10:18 PM
 */

public class Animal {

    private String species;
    private boolean canHop;
    private boolean canSwim;

    public Animal(String species, boolean canHop, boolean canSwim) {
        this.species = species;
        this.canHop = canHop;
        this.canSwim = canSwim;
    }

    public boolean canHop() {
        return canHop;
    }

    public boolean canSwim() {
        return canSwim;
    }

    public String toString() {
        return species;
    }
}
