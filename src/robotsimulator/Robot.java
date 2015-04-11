package robotsimulator;

import java.util.ArrayList;

/**
 * The robot class will decide the boundaries of how the robot will move around the map. Location information relating to the robot itself
 * @author masona11
 */
class Robot {
   private Motor leftMotor;
   private Motor rightMotor;
   private final int maxMovementSpeed = 100;
   private int TotaldistanceTravelled;
   private double turnSpeed;
   private int[][] mapLocationLog = new int[2000][2000]; //User cannot specify more than 2k commands.

    public Motor getLeftMotor() {
        return leftMotor;
    }

    public int getMaxMovementSpeed() {
        return maxMovementSpeed;
    }

    public Motor getRightMotor() {
        return rightMotor;
    }

    public int getTotaldistanceTravelled() {
        return TotaldistanceTravelled;
    }

    public double getTurnSpeed() {
        return turnSpeed;
    }
   
            public int[][] getMapLocationLog() {
        return mapLocationLog;
    }

    public void setMapLocationLog(int[][] mapLocationLog) {
        this.mapLocationLog = mapLocationLog;
    }

   
   
   
   
    
}
