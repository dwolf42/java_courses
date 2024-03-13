package dwolf.project_battleship.model;

public class Ocean {
    State[][] quadrant;

    public Ocean(int xLatitude, int yLongitude) {
        quadrant = new State[xLatitude][yLongitude];
        for (int i = 0; i < xLatitude; i++) {
            for (int j = 0; j < yLongitude; j++) {
                quadrant[i][j] = State.WATER;
            }
        }

    }

    public State[][] getOcean() {

    }

    public void scape() {
        State state = State.WATER;
        System.out.println(state);


        /*
         * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
         * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
         * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
         * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
         * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
         * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
         * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
         * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
         * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
         * [(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)][(~)]
         *
         *
         *
         *
         * */

    }

}
