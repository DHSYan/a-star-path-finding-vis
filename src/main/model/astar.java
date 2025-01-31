package astar;

public class astar {
    private int xPos;
    private int yPos;

    private int xTarget;
    private int yTarget;

    public astar(int xPos, int yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void setTarget(int xTarget, int yTarget) {
        this.xTarget = xTarget;
        this.yTarget = yTarget;
    }
}
