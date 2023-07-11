import java.rmi.MarshalException;

public class Matrix {
    private double NumberMatrix[][];
    private int cols, rows;
    Matrix(int Rows, int Cols){
        NumberMatrix = new double[Rows][Cols];
        for(int i = 0; i < Rows; ++i)
            for(int j = 0; j < Cols; ++j)
                NumberMatrix[i][j] = 0;
        cols = Cols;
        rows = Rows;
    }
    public void setValue(int i, int j, double value){
        try{
            NumberMatrix[i][j] = value;
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Массив меньшего размера, нет такой строки/столбца");
            ex.printStackTrace();
        }
    }
    public double getValue(int i, int j){
        try{
            return NumberMatrix[i][j];
        }
        catch (ArrayIndexOutOfBoundsException ex){
            System.out.println("Массив меньшего размера, нет такой строки/столбца");
            ex.printStackTrace();
            return 0;
        }
    }
    //Принимаем ссылку на объект второй матрицы и прибавляем её к текущей матрице
    public void matrixSum(Matrix matrix2){
        //Проверяем, равенство столбцов и строк
        if(matrix2 != null)
            if((cols == matrix2.cols) && (rows == matrix2.rows)){
                for(int i = 0; i < rows; ++i)
                    for(int j = 0; j < cols; ++j)
                        NumberMatrix[i][j] += matrix2.getValue(i, j);
            }
    }
    //Умножение на число
    public void mulNumber(double num){
        for(int i = 0; i < rows; ++i)
            for(int j = 0; j < cols; ++j)
                NumberMatrix[i][j] *= num;
    }
    //Вывод на печать
    public void printMatrix(){
        for(int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j)
                System.out.print(NumberMatrix[i][j] + '\t');
            System.out.println();
        }
    }
    //Умножаем данную матрицу на объект другой матрицы
    public double[][] mulMatrix(Matrix m){
        if(cols == m.rows){
            double resMatrix[][] = new double[rows][m.cols];
            for(int l = 0; l < m.cols; ++l)
                for(int i = 0; i < rows; ++i){
                    double buffer = 0;
                    for(int j = 0; j < cols; ++j)
                        buffer += NumberMatrix[i][j] * m.getValue(i,l);
                    resMatrix[i][l] = buffer;
                }
            return resMatrix;
        }
        return null;
    }
}
