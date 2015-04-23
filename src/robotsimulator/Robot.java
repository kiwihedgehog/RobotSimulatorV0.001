package robotsimulator;

import java.util.ArrayList;

/**
 * The robot class will decide the boundaries of how the robot will move around the map. Location information relating to the robot itself
 * @author masona11
 * @author Mitch Hill
 */
class Robot {
   private Map surfaceArea = new Map();
   
   Movement m = new Movement(surfaceArea);
   
   private Motor leftMotor;
   private Motor rightMotor;
   private final int maxMovementSpeed = 100;
   private int TotaldistanceTravelled;
   ArrayList positionLog = new ArrayList();
   private int[][] mapLocationLog = new int[2000][2000]; //We need to dynamicaly set the array size after we know what commands the user will make.

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
   
            public int[][] getMapLocationLog() {
        return mapLocationLog;
    }

    public void setMapLocationLog(int[][] mapLocationLog) {
        this.mapLocationLog = mapLocationLog;
    }

    //Prints all the map data for the current Robot.
   public void printPosition(Map currentMapData){
       System.out.println(currentMapData.getyCoordinates());
       System.out.println(currentMapData.getxCoordinates());
       System.out.println(currentMapData.getCardinalDirection());
       System.out.println(currentMapData.getRotationalDegree());
   }
   
   
   
    
}
