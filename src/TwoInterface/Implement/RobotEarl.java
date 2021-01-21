package TwoInterface.Implement;

import TwoInterface.RobotInterface;

public class RobotEarl implements RobotInterface {
    @Override
    public void move(){
        System.out.println("Robot Earl move forward");
    }
    @Override
    public String talk(){
        return "My name is Earl";
    }
    @Override
    public Integer number(){
        return 1234;
    }
    @Override
    public void grab(){
        System.out.println("Robot Earl grab with left hand");
    }
    @Override
    public void talent(){
        sing();
    }

    private void sing(){
        System.out.println("Robot Earl can sing");
    }
}