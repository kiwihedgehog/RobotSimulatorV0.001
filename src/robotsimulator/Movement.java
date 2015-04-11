package robotsimulator;

import java.util.ArrayList;

/**
 *
 * @author masona11
 */
class Movement {
    private Map surfaceArea = new Map();
    int degreeDirection;
    String cardinalDirection;
    private Robot myRobot;
    private ArrayList positionLog = new ArrayList();
    public ArrayList calculatePosition(ArrayList timeQeue){ //should have more intake parametres
               
        return timeQeue;
    }
    
    public int calculateRotation(int motorPowerRight, int motorPowerLeft) {
        int degreesToTurn;
        int forceDifference = 0;
        boolean right = true;
        
        if (motorPowerRight > motorPowerLeft){
            forceDifference = motorPowerRight - motorPowerLeft;
            right = false;
        }
        else if (motorPowerRight < motorPowerLeft) {
            forceDifference = motorPowerLeft - motorPowerRight;
            right = true;
        }
        else{degreesToTurn = 0;}
        degreesToTurn = (forceDifference * 90) / 100;
        
        
        return degreesToTurn;
    }
    
    public String calculateDirectionalFace(int degreeDirection) {
        // Switch statement to get face position.
        
        int i = 0;
        switch(i) {
            case 1: cardinalDirection = "North";
                break;
            case 2: cardinalDirection = "North East";
                break;
            case 3: cardinalDirection = "East";
                break;
            case 4: cardinalDirection = "South East";
                break;
            case 5: cardinalDirection = "South";
                break;
            case 6: cardinalDirection = "South West";
                break;
            case 7: cardinalDirection = "West";
                break;
            case 8: cardinalDirection = "North West";    
                break;
                
                
        }
        
    return cardinalDirection;
    }

    public boolean isBetween(int x, int lower, int upper){
       boolean condition = true;
        
        return condition;
    }
    public ArrayList getPositionLog() {
        return positionLog;
    }

    public void setPositionLog(ArrayList positionLog) {
        this.positionLog = positionLog;
    }

    public void setDirection() {
        
    }

    public int turnRight(int degreesToTurn) {
        if((degreeDirection + degreesToTurn) > 360){
            degreeDirection += degreesToTurn - 360;
        }
        else{ degreeDirection += degreesToTurn; }
        return degreeDirection;
    }

    public void moveBackwards(int centimetres) {
    }

    public int turnLeft(int degreesToTurn) {
         if(degreesToTurn <= degreeDirection){
        degreeDirection -= degreesToTurn;
        }
         else{degreeDirection = degreesToTurn - 360;}
        return degreeDirection;
    }

    public void moveForward(int centimetres) {
    }
    

    
    
    
    
    
   
}
