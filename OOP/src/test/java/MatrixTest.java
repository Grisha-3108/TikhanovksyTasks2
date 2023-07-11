import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @Test
    void setValue() {
        Matrix test = new Matrix(2, 2);
        test.setValue(1, 1, 2.5);
        assertEquals(2.5, test.getValue(1, 1));
    }

    @Test
    void matrixSum() {
        Matrix test1 = new Matrix(2, 2);
        for(int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                test1.setValue(i, j, 1);
        Matrix test2 = new Matrix(2, 2);
        for(int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                test2.setValue(i, j, 1);
        test1.matrixSum(test2);
        double test[][] = new double[2][2];
        for(int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                test[i][j] = 2;
        for(int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                assertEquals(2, test1.getValue(i, j));
    }

    @Test
    void mulNumber() {
        Matrix test1 = new Matrix(2, 2);
        for(int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                test1.setValue(i, j, 1);
        test1.mulNumber(2);
        double test[][] = new double[2][2];
        for(int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                test[i][j] = 2;
        for(int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                assertEquals(2, test1.getValue(i, j));
    }

    @Test
    void printMatrix() {
        Matrix test1 = new Matrix(2, 2);
        for(int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                test1.setValue(i, j, 1);
        test1.printMatrix();
    }

    @Test
    void mulMatrix() {
        Matrix test1 = new Matrix(2, 2);
        for(int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                test1.setValue(i, j, 1);
        Matrix test2 = new Matrix(2, 2);
        for(int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                test2.setValue(i, j, 1);
        //Записываем результат умножения в матрицу res
        double res[][] = test1.mulMatrix(test2);
        double test[][] = new double[2][2];
        for(int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                test[i][j] = 2;
        for(int i = 0; i < 2; ++i)
            for (int j = 0; j < 2; ++j)
                assertEquals(2, res[i][j]);
    }
}