package robotsimulator;

import java.util.ArrayList;

/**
 *
 * @author masona11
 */
class Commands {
    private ArrayList timeQeue = new ArrayList();
    private ArrayList<String> commandList = new ArrayList();
    final private ArrayList<String> instructionList = new ArrayList();
    private int degreesToTurn;
    private int waitTime;
    private double centimetres;
    private Movement moveToLocation;
    private Robot myRobot;
    
    public Commands() {
        instructionList.add("stop - Stops the robot");
        instructionList.add("forward - Moves the robot forward at default motor speed.");
        instructionList.add("backward - Moves the robot back at a default motor speed.");
        instructionList.add("left - Turns the robot left at the current set speed.");
        instructionList.add("right - Turns the robot right at the current set speed.");
        instructionList.add("wait - Commands the robot to wait for a set period of time.");
        instructionList.add("go - Starts the simulation after commands are entered.");
        instructionList.add("exit - Exits the Robot Simulator.");
    }
    
    public void stopRobot(){
        
    }
    
    public int getDegrees(){
        int blah = 0;
        return blah;
    }
    public void left (int degrees) {
        
    }
    public void right(int centimetres){
            
        }
    public void forward(int centimetres){
            
        }
    public void backwards(int degrees){
            
        }
    public void wait(int seconds){
        
    }

    public void setCentimetres(double centimetres) {
        this.centimetres = centimetres;
    }

    public double getCentimetres() {
        return centimetres;
    }

    public int getDegreesToTurn() {
        return degreesToTurn;
    }

    public void setDegreesToTurn(int degreesToTurn) {
        this.degreesToTurn = degreesToTurn;
    }

    public Movement getMoveToLocation() {
        return moveToLocation;
    }

    public void setMoveToLocation(Movement moveToLocation) {
        this.moveToLocation = moveToLocation;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public Robot getMyRobot() {
        return myRobot;
    }

    public void setMyRobot(Robot myRobot) {
        this.myRobot = myRobot;
    }

    public ArrayList getTimeQeue() {
        return timeQeue;
    }

    public void setTimeQeue(ArrayList timeQeue) {
        this.timeQeue = timeQeue;
    }

    public ArrayList getCommandList() {
        return commandList;
    }

    public void addCommandToList(String commands) {
        commandList.add(commands);
        
    }

    public ArrayList<String> getInstructionList() {
        return instructionList;
    }

   
    
    
    
    

}
