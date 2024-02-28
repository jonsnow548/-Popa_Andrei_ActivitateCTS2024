package model;

public class Zebra extends Animal {
    public  Zebra(String name,int age)
    {
        super(name,age);
    }
    public void eat(String food) {
        System.out.println(" The zebra" +" "+ this.getName() +" "+ "eats" +" "+ food);

    }
}
