package cz.kamproductions.iqchess;

public class Tile {
    int posX;
    int posY;

    public Tile(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    @Override
    public String toString() {
        return "Tile: x=" + posX + " y=" + posY;
    }
}
