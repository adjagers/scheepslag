
public class Ship {
    int length;
    String type;
    char shipSymbol;

    public Ship(String type, int length, char shipSymbol) {
        this.type = type;
        this.length = length;
        this.shipSymbol = shipSymbol;
    }

    public void drawShip() {
        this.shipSymbol = 'A';
        // TODO :: IF SHIP GETS HIT CHANGE LENGTH SHIP
    }

    public int getLength() {
        return length;
    }

    public String getType() {
        return type;
    }

    public char getShipSymbol() {
        return shipSymbol;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setShipSymbol(char shipSymbol) {
        this.shipSymbol = shipSymbol;
    }

}
