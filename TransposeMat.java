public class TransposeMat {
    private double[][] matrix;
    public TransposeMat(double[][] matrix){
        this.matrix = matrix;
    }
    public double[][] tanspose(double[][] matrix){
        int numCol = matrix[0].length;
        int numRow = matrix.length;

        double[][] matrixT = new double[numCol][numRow];

        for (int i = 0; i < numCol; i++) {
            for (int j = 0; j < numRow; j++) {
                matrixT[i][j] = matrix[j][i];
            }
        }
        return matrixT;
    }
}
