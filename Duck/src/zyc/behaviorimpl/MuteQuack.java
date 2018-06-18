package zyc.behaviorimpl;
import zyc.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {  
  
    @Override  
    public void quack() {  
        // TODO Auto-generated method stub  
        System.out.println("<< Silence >>");  
    }  
  
} 