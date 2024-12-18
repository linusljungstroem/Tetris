package Pieces;


import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Piece {

    public ArrayList<int[]> coordinates;

    public Color color;




    static public Piece createPiece() {
        return new IPiece();
    }

    public ArrayList<int[]> getCoordinates() {
        return coordinates;
    }

    public void fall() {
        for (int[] i : coordinates) {
            i[0] += 1;
        }
    }

    /*public ArrayList<Integer[]> getLocations {

        for( )

    }*/

}


