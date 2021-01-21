package TwoInterface;

import TwoInterface.Implement.RobotEarl;
import TwoInterface.Implement.RobotEarth;

import java.util.Arrays;
import java.util.List;

public class MainInterface {
    public static void main(String... args){
        List<RobotInterface> data = Arrays.asList(new RobotEarth(), new RobotEarl());
        for (RobotInterface tmp : data){
            execute(tmp);
        }
    }

    public static void execute(RobotInterface tranfer){
        tranfer.move();
        System.out.println(tranfer.talk());
        System.out.println(tranfer.number());
        tranfer.grab();
        tranfer.talent();
        System.out.println("================");
    }
}