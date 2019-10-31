package cz.kamproductions.iqchess;

import java.util.ArrayList;

public class Board {
    private ArrayList<Tile> tiles = new ArrayList<>();
    private int sizeX = 8, sizeY = 8;

    public Board() {
        int x = 0,y = 0;

        System.out.println("Init ...");

        while(x < sizeX) {
            while (y < sizeY) {
                Tile tile = new Tile(x, y);
                tiles.add(tile);

                //System.out.println("X:" + x + " Y:" + y );

                x++;
                if(x >= sizeX) {
                    y++;
                    x = 0;
                }
            }
            break;
        }

        System.out.println("Tiles created:");
        for (Tile tile: tiles) {
            System.out.println(tile.toString());
        }

        System.out.println("Size should be: " + sizeX * sizeY + " and is: " + tiles.size());
    }

    private Tile[] getAdjectedTiles(Tile tile) {

    }
}
