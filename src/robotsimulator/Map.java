package robotsimulator;

/**
 *  The Map class contains everything to do with the location 
 * references which have the ability to describe the location to the user.
 * @author masona11
 * @author Mitch Hill
 */
class Map {
    private int xCoordinates;
    private int yCoordinates;
    String cardinalDirection;
    private int rotationalDegree;
    
    
    public Map(){
        xCoordinates = 0;
        yCoordinates = 0;
        cardinalDirection = "North";
        rotationalDegree = 0;
    }

    public String getCardinalDirection() {
        return cardinalDirection;
    }

    public int getRotationalDegree() {
        return rotationalDegree;
    }

    public int getxCoordinates() {
        return xCoordinates;
    }

    public int getyCoordinates() {
        return yCoordinates;
    }

    public void setCardinalDirection(String cardinalDirection) {
        this.cardinalDirection = cardinalDirection;
    }

    public void setRotationalDegree(int rotationalDegree) {
        this.rotationalDegree = rotationalDegree;
    }

    public void setxCoordinates(int xCoordinates) {
        this.xCoordinates = xCoordinates;
    }

    public void setyCoordinates(int yCoordinates) {
        this.yCoordinates = yCoordinates;
    }
    
    


}
