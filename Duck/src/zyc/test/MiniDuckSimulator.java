package zyc.test;
import zyc.behaviorimpl.FlyRocketPowered;
import zyc.entites.DecoyDuck;
import zyc.entites.Duck;
import zyc.entites.MallardDuck;
import zyc.entites.ModelDuck;

public class MiniDuckSimulator {  
  
    public static void main(String[] args) {  
        Duck mallard = new MallardDuck();  
        mallard.performFly();  
        mallard.performQuack();  
        mallard.display();  
          
        Duck decoy = new DecoyDuck();  
        decoy.performFly();  
        decoy.performQuack();  
        decoy.display();  
          
        Duck model = new ModelDuck();  
        model.performFly();;  
        model.performQuack();  
        model.display();  
        //��̬�ظı�Ѽ�ӵ���Ϊ  
        model.setmFlyBehavior(new FlyRocketPowered());  
        model.performFly();;  
        model.performQuack();  
        model.display();  
    }  
  
}  