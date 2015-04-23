package robotsimulator;

/**
 * The Motor class is where the motor power and names will be set. Any additional modifications in terms of robot movement 
 * will happen in this class.
 * @author masona11
 * @author Mitch Hill
 */
class Motor {
    private String motorName;
    private int motorPower;

    public void setMotorName(String motorName) {
        this.motorName = motorName;
    }

    public String getMotorName() {
        return motorName;
    }

    public void setMotorPower(int motorPower) {
        this.motorPower = motorPower;
    }

    public int getMotorPower() {
        return motorPower;
    }
    
    
}
