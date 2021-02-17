package lab_2;

import java.util.ArrayList;

public class Matrix {
    private int rows;
    private int columns;

    private ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public ArrayList<ArrayList<Integer>> getMatrix() {
        return matrix;
    }

    public void addRow(ArrayList<Integer> row) {
        this.matrix.add(row);
    }

    public Matrix matrixAddition(Matrix matrix) {
        int cell;
        Matrix addedMatrix = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < this.getColumns(); j++) {
                int cellA = this.matrix.get(i).get(j);
                int cellB = matrix.getMatrix().get(i).get(j);

                cell = cellA + cellB;
                row.add(cell);
            }
            addedMatrix.addRow(row);
        }

        return addedMatrix;
    }

    public void print() {
        for (int i = 0; i < this.getRows(); i++) {
            System.out.print("[ ");
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(" " + this.matrix.get(i).get(j) + " ");
            }
            System.out.print(" ]\n");
        }
    }
}
