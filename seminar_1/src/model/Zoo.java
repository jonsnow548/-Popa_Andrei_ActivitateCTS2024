package model;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    private String name;
    private ZooKeeper zooKeeper;
    private Map<Animal,String> animals;

    public Zoo(String name, ZooKeeper zooKeeper, Map<Animal,String> animals) {
        this.name = name;
        this.zooKeeper = zooKeeper;
        this.animals = animals;
    }
    public void feedAllAnimals() {
        for (Map.Entry<Animal, String> a : animals.entrySet()) {
            zooKeeper.feedAnimal(a.getKey(), a.getValue());
        }
    }
   public void addAnimal(Animal animal,String food){


        if(animals==null) {

           animals=new HashMap<>();

        }
        animals.put(animal, food);


        }
}
