package dwolf.project_battleship.stage_1Of6;

import java.util.ArrayList;
import java.util.LinkedList;

class Coords {
    String askedCoords;
    String allPositions;
    int x1Coord;
    int y1Coord;
    int x2Coord;
    int y2Coord;

    public Coords(String askedCoords) {
        this.askedCoords = askedCoords;
        extractCoords();
    }

    private void extractCoords() {
        String[] splittedCoords = askedCoords.split(" ");
        this.x1Coord = (int) splittedCoords[0].charAt(0) - 65;
        // FIXME: throws Index 2 ouf of bound for length 2
        this.x2Coord = (int) splittedCoords[2].charAt(0) - 65;
        this.y1Coord = Integer.parseInt(splittedCoords[1].substring(1)) - 1;
        this.y2Coord = Integer.parseInt(splittedCoords[3].substring(1)) - 1;
    }

    public int getX1Coord() {
        return x1Coord;
    }

    public int getY1Coord() {
        return y1Coord;
    }

    public int getX2Coord() {
        return x2Coord;
    }

    public int getY2Coord() {
        return y2Coord;
    }

    // 65 = A => 0
    // 66 = B => 1
    // 67 = C => 2
    // 68 = D => 3
    // 69 = E => 4
    // 70 = F => 5
    // 71 = G => 6
    // 72 = H => 7
    // 73 = I => 8
    // 74 = J => 9
    public String getAllPositions() {
        /*
        A1 A4 = x1 == x2
        B4 C4 = y1 == y2
         */
        if (this.allPositions == null) {
            StringBuilder allPositions = new StringBuilder();
            if (x1Coord == x2Coord) {
                for (int i = y1Coord + 1; i < y2Coord; i++) {
                    allPositions.append(x1Coord);
                    allPositions.append((char) i);
                    allPositions.append(" ");
                }
                allPositions.deleteCharAt(allPositions.length() - 1);
            }
            this.allPositions = allPositions.toString();
            return allPositions.toString();
        }
       return this.allPositions;
    }

}
