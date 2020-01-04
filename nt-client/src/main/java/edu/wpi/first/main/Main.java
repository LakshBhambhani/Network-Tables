
package edu.wpi.first.main;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableEntry;
import edu.wpi.first.networktables.NetworkTableInstance;


public class Main {

  private double x=0, y=0;
  public static void main(String[] args) {
    new Main().run();
  }

  public void run() {
    NetworkTableInstance inst = NetworkTableInstance.getDefault();
    NetworkTable table = inst.getTable("datatable");
    
    NetworkTableEntry xEntry = table.getEntry("x");
    NetworkTableEntry yEntry = table.getEntry("y");
 
    inst.startClient("192.168.4.1", 8081);

    while(true){
      xEntry.forceSetNumber(x);
      yEntry.forceSetNumber(y);
      x++;
      y++;

      System.out.println(x);
      System.out.println(y);

      try {
             Thread.sleep(1000);
          } catch (InterruptedException ex) {
             System.out.println("Interrupted");
             Thread.currentThread().interrupt();
             return;
          }
    }    
  }
}