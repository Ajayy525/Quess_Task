import java.util.Scanner;

class AddMat {
    public static void main(String args[]) {
        int i, j;
        System.out.println("Enter the number of row1 and column1");
        Scanner sc= new Scanner(System.in);
        int row1 = sc.nextInt();
        int col1 = sc.nextInt();
        System.out.println("Enter the number of row2 and column2");
        int row2 = sc.nextInt();
        int col2 = sc.nextInt();
        int sum=0;
        if (row1 == row2 && col1 == col2) {
            int a[][] = new int[row1][col1];
            int b[][] = new int[row2][col2];
            int res[][] = new int[row1][col2];

            System.out.println("Enter the elements of matrix1");

            for (i = 0; i < row1; i++) {

                for (j = 0; j < col1; j++)
                    a[i][j] = sc.nextInt();

                System.out.println();
            }
            System.out.println("Enter the elements of matrix2");

            for (i = 0; i < row2; i++) {

                for (j = 0; j < col2; j++)
                    b[i][j] = sc.nextInt();

                System.out.println();
            }

            for (i = 0; i < row1; i++)
                for (j = 0; j < col2; j++)
                    res[i][j] = a[i][j] + b[i][j];

            System.out.println("Sum of matrices:-");

            for (i = 0; i < row1; i++) {
                for (j = 0; j < col2; j++) {
                    System.out.print(res[i][j] + "\t");
                }

                System.out.println();
            }

        }else{
            System.out.println("the size of the Matrix is not same so Addition is not possible");
        }


    }
}