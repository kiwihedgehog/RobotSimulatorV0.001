package robotsimulator;

/**
 *
 * @author masona11
 */
class Map {
    private int xCoordinates;
    private int yCoordinates;
    private int[][] mapLocationLog = new int[2000][2000];
    
        public int[][] getMapLocationLog() {
        return mapLocationLog;
    }

    public void setMapLocationLog(int[][] mapLocationLog) {
        this.mapLocationLog = mapLocationLog;
    }
}
