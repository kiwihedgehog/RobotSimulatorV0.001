package robotsimulator;
import java.util.Scanner;
/**
 *
 * @author masona11
 */
public class SimulatorEngineState {
    
    
    private int engineStateNumber;
    private int engineState;
    private Commands giveCommands = new Commands();
    
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

    public Commands getGiveCommands() {
        return giveCommands;
    }

    public void setGiveCommands(Commands giveCommands) {
        this.giveCommands = giveCommands;
    }
    
        public void evaluatePosition(Robot robotLocation) {
        System.out.println("Robot is now located at the co ordinates of " + "");
    }

    private void allowCommands() {
        Scanner myCommands = new Scanner(System.in);
        Commands userCommands = new Commands();
        String commands = "start";
        
        while(!commands.equals("exit")){
        
           commands = myCommands.next();
            switch (commands) {
                case "exit":
                    commands = "exit";
                    break;
                case "commands":
                    System.out.println(userCommands.getInstructionList());
                    break;
                case "wait":
                    Scanner inputWaitTime = new Scanner(System.in);
                    
                    System.out.println("How long would you like to wait?");
                    int waitTime = inputWaitTime.nextInt(); 
                default:
                    userCommands.addCommandToList(commands);
                    break;
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
    for(int i = 0; i > giveCommands.getCommandList().size(); i++){
        
        switch(giveCommands.getCommandList().get(i).toString()) {
            case "stop": giveCommands.stopRobot();
                break;
            case "forward": giveCommands.forward(25);
                break;
            case "backward": giveCommands.backwards(23);
                break;
            case "left": giveCommands.left(34);
                break;
            case "right": giveCommands.right(46);
                break;
            case "wait": giveCommands.wait(23);
                break;
            default: System.out.println("Command not recognized");
        }
    }
    }
    
    
    
}
