package service;

import lombok.Setter;

@Setter

public abstract class Duck {
    protected FlyBehavior fb;
    protected SoundBehavior sb;

    public Duck(){

    }
    public abstract void display();

    public void performFly(){
        fb.fly();
    }
    public void swim(){
        System.out.println("The duck is swimming");
    }
    public void performQuack(){
        sb.makeSound();
    }


    @Override
    public String toString() {

        return "Duck{}";
    }
}
