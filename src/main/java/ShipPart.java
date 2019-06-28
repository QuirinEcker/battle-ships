public class ShipPart {
    private int x;
    private int y;
    private boolean shot;

    public ShipPart(char x, char y) {
        this.x = x;
        this.y = y;
    }

    //region Getter und Setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isShot() {
        return shot;
    }

    public void setShot(boolean shot) {
        this.shot = shot;
    }
    //endregion
}
