package zyc.entites;
import zyc.behaviorimpl.FlyWithWings;
import zyc.behaviorimpl.Quack;

public class MallardDuck extends Duck {  
      
      
    /** 
     * ��������һֻ�ó��ɲ���¸½е�Ѽ�� 
     */  
    public MallardDuck() {  
        super();  
        mFlyBehavior = new FlyWithWings();  
        mQuackBehavior = new Quack();  
    }  
  
    @Override  
    public void display() {  
        System.out.println("I'm a real Mallard duck");  
    }  
  
}  