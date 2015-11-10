
public class Matrix {
    private int rows;
    private int colomns;
    public int[][] matrix;

    private Matrix getMinor(Matrix minor, int row, int column){
        int minorLength = minor.rows-1;
        int[][] values = new int[minorLength][minorLength];
        int dI = 0;
        int dJ = 0;
        for(int i = 0; i <= minorLength; i++){
            dJ = 0;
            for(int j=0; j<=minorLength; j++){
                if(i==row){
                    dI=1;
                }
                else{
                    if(j==column){
                        dJ=1;
                    }
                    else{
                        minor.matrix[i-dI][j-dJ] = matrix[i][j];
                    }
                }
            }
        }
        return minor;
    }

    public Matrix(int r, int c){
        this.matrix = new int[r][c];
        this.rows = r;
        this.colomns = c;
    }

    public int getElement(int r, int c){
        return matrix[r][c];
    }

    public void setElement(int r, int c, int value) {
        if (r < rows && c < colomns) {
            matrix[r][c] = value;
        }
    }

    public Matrix plusMatrix (Matrix term){
        if (term == null || this.rows != term.rows || this.colomns != term.colomns){
            return this;
        }
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < colomns; j++){
                this.matrix[i][j] += term.matrix[i][j];
            }
        }
        return this;
    }

 /*   public int countDeterminant() {                              Пока не работает =(
        if (this.rows != this.colomns) {
            return 0;
        }
        Matrix temp = new Matrix(rows, colomns);
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < colomns; j++){
                temp.matrix[i][j] = this.matrix[i][j];
            }
        }
        int result = 0;
        if (temp.rows == 2) {
            result = temp.matrix[0][0] * temp.matrix[1][1] - temp.matrix[1][0] * temp.matrix[0][1];
        } else {
            int koeff = 1;
            for (int i = 0; i < temp.rows; i++) {
                if (i % 2 == 1) {
                    koeff = -1;
                } else {
                    koeff = 1;
                }
                temp = temp.getMinor(temp, 0, 1);
                result += koeff * this.matrix[0][i] * temp.countDeterminant();
            }
        }
        return result;
    }*/



}
