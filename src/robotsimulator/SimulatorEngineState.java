package robotsimulator;
import java.util.Scanner;
/**
 *
 * The simulator engine class will be a class in which all methods will be activated and used together to combine and work the program as a whole.
 * If you want to spend any time cleaning up redundant or sloppy code, this will be the place to do so.
 * @author masona11
 */
public class SimulatorEngineState {
    
    
    private int engineStateNumber;
    private int engineState;
    Commands userCommands = new Commands();
    
    public String displayInstructions(){
        String instructions = "Please enter a command or type 'commands' for the command list:";
        return instructions;
    }
    
    public void selfEvaluation() { // Needs Parametres
        
    }
    
    //Moved Break method to Commands Class.
    
    public void shutDown () {
     System.exit(5);
    }

    public int getEngineState() {
        return engineState;
    }

    public void setEngineState(int engineState) {
        this.engineState = engineState;
        switch(engineState){
            case 1: System.out.println(displayInstructions());
                break;
            case 2: allowCommands();
                break;
            case 3: readCommandList();
                break;
        }
    }

    public int getEngineStateNumber() {
        return engineStateNumber;
    }

    public void setEngineStateNumber(int engineStateNumber) {
        this.engineStateNumber = engineStateNumber;
    }

    public Commands getUserCommands() {
        return userCommands;
    }

    public void setUserCommands(Commands userCommands) {
        this.userCommands = userCommands;
    }
    
        public void evaluatePosition(Robot robotLocation) {
        System.out.println("Robot is now located at the co ordinates of " + "");
    }

    private void allowCommands() {
        Scanner myCommands = new Scanner(System.in);
        
        String commands = "start";
        
        while(!commands.equals("go")){
        
           commands = myCommands.next();
            switch (commands) {
                case "go":
                    commands = "go";
                    break;
                case "commands":
                    for(int i = 0; i < (userCommands.getInstructionList()).size(); i++){
                    System.out.println(userCommands.getInstructionList().get(i));
                    }
                    break;
                case "wait":
                    Scanner inputWaitTime = new Scanner(System.in);
                    
                    System.out.println("How long would you like to wait?");
                    int waitTime = inputWaitTime.nextInt(); 
                    break;  
                case "exit":  // Can change the code to finish everything it is doing and exit via control flow.
                    System.exit(0);
            }
            // The if statement below is to stop the program adding the user interface commands to the robots command list
            if(!commands.equals("commands") || !commands.equals("go")){
                userCommands.addCommandToList(commands);
            }
        }
        
        
        // This is just our test to make sure the information is being stored in the array.
        int count = (userCommands.getCommandList().size());
	System.out.println("Count: " + count);

	// Loop through elements.
	for (int i = 0; i < userCommands.getCommandList().size(); i++) {
	    String value = (userCommands.getCommandList().get(i)).toString();
	    System.out.println("Command: " + value);
	}
    }

    private void readCommandList(){
    for(int i = 0; i > userCommands.getCommandList().size(); i++){
        
        switch(userCommands.getCommandList().get(i).toString()) {
            case "stop": userCommands.stopRobot();
                break;
            case "forward": userCommands.forward(25);
                break;
            case "backward": userCommands.backwards(23);
                break;
            case "left": userCommands.left(34);
                break;
            case "right": userCommands.right(46);
                break;
            case "wait": userCommands.wait(23);
                break;
            default: System.out.println("Command not recognized");
        }
    }
    }
    
    
    
}
