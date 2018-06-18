package zyc.entites;
import zyc.behavior.FlyBehavior;
import zyc.behavior.QuackBehavior;

public abstract class Duck {  
    public Duck() {  
        super();  
        // TODO Auto-generated constructor stub  
    }  
     FlyBehavior mFlyBehavior; //has A �����Ϊ  
     QuackBehavior mQuackBehavior; //has A �����Ϊ  
    public void swim(){  
        System.out.println("All ducks float, even decoys!");  
    }  
    public abstract void display();  
    public   void performFly(){  
        mFlyBehavior.fly(); //ί�и���Ϊ�ദ��  
    }  
    public   void performQuack(){  
        mQuackBehavior.quack(); //ί�и���Ϊ�ദ��  
    }  
    public void setmFlyBehavior(FlyBehavior mFlyBehavior) {  
        this.mFlyBehavior = mFlyBehavior;  
    }  
    public void setmQuackBehavior(QuackBehavior mQuackBehavior) {  
        this.mQuackBehavior = mQuackBehavior;  
    }  
          
      
  
}  
