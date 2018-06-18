package zyc.entites;
import zyc.behaviorimpl.FlyNoWays;
import zyc.behaviorimpl.MuteQuack;

public class DecoyDuck extends Duck {  
    /** 
     * ��������һֻ�����Ҳ����ɵ�Ѽ�� 
     */  
    public DecoyDuck() {  
        super();  
        // TODO Auto-generated constructor stub  
        mFlyBehavior = new FlyNoWays();  
        mQuackBehavior = new MuteQuack();  
    }  
  
    @Override  
    public void display() {  
        System.out.println("I'm a duck Decoy");  
  
    }  
  
}  
