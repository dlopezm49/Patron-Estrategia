package service;

public class ModelDuck extends Duck {

    public ModelDuck() {
        fb = new FlyNoWay ();
        sb = new MuteSound();
    }

    @Override
    public void display() {
        System.out.println("Soy el pato modelo");

    }

    @Override
    public String toString() {
        return "ModelDuck{}";
    }
}
