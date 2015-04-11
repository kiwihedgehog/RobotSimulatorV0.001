package robotsimulator;

import java.util.ArrayList;

/**
 *  The Map class contains everything to do with the location 
 * references which have the ability to describe the relational location of the robot
 * @author masona11
 */
class Map {
    private int xCoordinates;
    private int yCoordinates;
    final String north = "North";
    final String south = "South";
    final String east =  "East";
    final String west = "West";
    String cardinalDirection;
    ArrayList positionLog = new ArrayList();
    
    public void setMapPosition(){
        
    }

    public ArrayList getPositionLog(Movement movement) {
        return positionLog;
    }

    public void setPositionLog(ArrayList positionLog) {
        this.positionLog = positionLog;
    }


}
