package zyc.entites;
import zyc.behaviorimpl.FlyNoWays;
import zyc.behaviorimpl.Quack;

public class ModelDuck extends Duck {  
  
      
    public ModelDuck() {  
        super();  
        // TODO Auto-generated constructor stub  
        mFlyBehavior = new FlyNoWays();  
        mQuackBehavior = new Quack();  
    }  
  
    @Override  
    public void display() {  
        System.out.println("I'm a model duck");  
    }  
  
}  