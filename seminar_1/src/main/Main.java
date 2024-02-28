package main;

import model.*;

import java.sql.SQLOutput;
import java.util.HashMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public enum FeedType
    {
        OMNIVORE,
        HERIBIVORE,

        CARNIVORE
    }
    public static void main(String[] args) {
        ZooKeeper zooKeeper =new ZooKeeper("Andrei");
        Zoo zoo=new Zoo("Zoo",zooKeeper,new HashMap<>());
        Animal anotherAnimal=new Zebra("Marty",21);

        zoo.addAnimal(anotherAnimal,"grass");
        zoo.addAnimal(new Lion("Simba",10),"meat");
        zoo.addAnimal(new Pisica("Sisi",2),"plic");
        zoo.feedAllAnimals();
        FeedType feedType=FeedType.CARNIVORE;
    }

}