import Entity.Station;

public class DataAccessSolution {
    private static DataAccessSolution ourInstance = new DataAccessSolution();

    public static DataAccessSolution getInstance() {
        return ourInstance;
    }

    private DataAccessSolution() {


    }
}
