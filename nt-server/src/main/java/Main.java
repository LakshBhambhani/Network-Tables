
import edu.wpi.first.networktables.NetworkTableInstance;

public class Main{

    public static void main(String[] args){

        NetworkTableInstance inst = NetworkTableInstance.getDefault();
        inst.startServer("networktables.ini", "0.0.0.0", 8081);
        System.out.println("Initialized");
 
        while(true){

        }     
  }
}

