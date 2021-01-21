package TwoInterface.Implement;

import TwoInterface.RobotInterface;

public class RobotEarth implements RobotInterface {
    @Override
    public void move(){
        System.out.println("Robot Earth move backward");
    }
    @Override
    public String talk(){
        return "My name is Earth";
    }
    @Override
    public Integer number(){
        return 5678;
    }
    @Override
    public void grab(){
        System.out.println("Robot Earth grab with right hand");
    }
    @Override
    public void talent(){
       jump();
    }

    private void jump(){
        System.out.println("Robot Earth can jump");
    }
}