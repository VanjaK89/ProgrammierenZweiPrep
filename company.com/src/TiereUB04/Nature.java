package TiereUB04;

import java.util.ArrayList;

public class Nature {
    ArrayList<Animal> animals = new ArrayList<>();

    public Nature() {
        this.animals = animals;
    }

    public void addAnimal(Animal a){
        animals.add(a);
    }

    public int countColor(String color) {
        int colorNr = 0;
        for (Animal a : animals) {
            if(a.color.equals(color)){
            ++colorNr;
        }
    }
    return colorNr;
    }
}
