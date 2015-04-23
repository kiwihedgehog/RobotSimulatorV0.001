package robotsimulator;

import java.util.ArrayList;

/**
 * The movement class will contain any calculations which are required to calculate a new position for the robot. This class largely relies on the map class and robot class.
 * @author masona11
 * @author Mitch Hill
 */
class Movement {
    private Map surfaceArea = new Map();
    int degreeDirection;
    private Robot myRobot;
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
            case 1: surfaceArea.cardinalDirection = "North";
                break;
            case 2: surfaceArea.cardinalDirection = "North East";
                break;
            case 3: surfaceArea.cardinalDirection = "East";
                break;
            case 4: surfaceArea.cardinalDirection = "South East";
                break;
            case 5: surfaceArea.cardinalDirection = "South";
                break;
            case 6: surfaceArea.cardinalDirection = "South West";
                break;
            case 7: surfaceArea.cardinalDirection = "West";
                break;
            case 8: surfaceArea.cardinalDirection = "North West";    
                break;
                
                
        }
        
    return surfaceArea.cardinalDirection;
    }

    public boolean isBetween(int x, int lower, int upper){
       boolean condition = true;
       
       
        return condition;
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

    public void moveForward(int time) {
        int centimetres;
        
        if (myRobot.getLeftMotor().getMotorPower() == myRobot.getRightMotor().getMotorPower()) {
            centimetres = time * myRobot.getRightMotor().getMotorPower();
        }
        
        
        //
        //
        //add to map
        //
        //
    }
    

    
    
    
    
    
   
}