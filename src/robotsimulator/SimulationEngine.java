package robotsimulator;

/**
 *
 * @author Andy
 */
public class SimulationEngine {
    private int engineStateNumber;
    private final int[] engineState = new int[5];
    Commands inputCommand = new Commands();
    
    
    public String displayInstructions(){
        String displayInstructions = "";
        return displayInstructions;
    }
    
    public void readInstructions(String x, String y ){ // Change to an array, Make the array with this Method
        // Put instructions into one String and with this method turn into an array.
        // We will execute the instructions based of an Array reading them one at a time.
    }
    
    public void selfEvaluation(){ // Will evaluate some parameters.
        
    }
    public void breakCommands() {
        // Will execute after each command in the Array.
    }
    public void shutDown() {
        
    }
}
