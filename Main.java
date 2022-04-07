import org.apache.commons.math3.linear.MatrixUtils;
import org.apache.commons.math3.linear.RealMatrix;
import org.apache.commons.math3.linear.SingularValueDecomposition;

public class Main {
    public static void main(String[] args) {
        double[][] testMat = {{3,2}, {2,3}, {2,-2}};

        for (int i = 0; i < testMat.length; i++) {
            for (int j = 0; j < testMat[0].length; j++) {
                System.out.print(testMat[i][j] + " ");
            }
            System.out.println();
        }
        RealMatrix m = MatrixUtils.createRealMatrix(testMat);
        SingularValueDecomposition singularTest = new SingularValueDecomposition(m);
        double[] single;
        single = singularTest.getSingularValues();
        for (int i = 0; i < single.length; i++) {
            System.out.print(single[i] + " ");


        }

        /*
        double[][] result;
        TransposeMat matT = new TransposeMat(testMat);
        result = matT.tanspose(testMat);
        System.out.println();


        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {

                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

         */



    }
}
