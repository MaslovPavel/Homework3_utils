
public class Matrix implements Cloneable {
    private int rows;
    private int colomns;
    public int[][] matrix;

    private Matrix getMinor(Matrix input, int row, int column){
        int minorLength = input.rows-1;
        Matrix output = new Matrix(minorLength, minorLength);
        int passRow = 0;
        int passCol = 0;
        for(int i = 0; i <= minorLength; i++){
            passCol = 0;
            for(int j = 0; j <= minorLength; j++){
                if(i == row){
                    passRow = 1;
                }
                else{
                    if(j == column){
                        passCol = 1;
                    }
                    else{
                        output.matrix[i - passRow][j - passCol] = input.matrix[i][j];
                    }
                }
            }
        }
        return output;
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


    int countDeterminant(){
        if (this.matrix == null || this.rows != this.colomns){
            return 0;
        }
        Matrix temp = new Matrix(this.rows, this.colomns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.colomns; j++) {
                temp.matrix[i][j] = this.matrix[i][j];
            }
        }
        int result = 0;
        if (temp.rows == 2) {
            result += temp.matrix[0][0] * temp.matrix[1][1] - temp.matrix[1][0] * temp.matrix[0][1];
        } else {
            int coeff = 1;
            for (int i = 0; i < temp.colomns; i++) {
                if (i % 2 == 1) {
                    coeff = -1;
                } else {
                    coeff = 1;
                }
                result += coeff * temp.matrix[i][0] * temp.getMinor(temp, i, 0).countDeterminant();
            }
        }
        return result;
    }


    public Matrix clone(){
        Matrix clone = new Matrix(this.rows, this.colomns);
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.colomns; j++) {
                clone.matrix[i][j] = this.matrix[i][j];
            }
        }
        return clone;
    }

}
