package Resources;

public class ToStringOverrides {

    int rows;
    int columns;
    int[][] data;
    //For matrix printing:
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result.append(data[i][j]);
                if (j < columns - 1) {
                    result.append("\t");
                } else if (i < rows - 1) {
                    result.append("\n");
                }
            }
        }
        return result.toString();
    }
}
