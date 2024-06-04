package mathematics;
public class Matrix {

  public void add(int a[][], int b[][],int size) {
    int i, j;
    int C[][] = new int[size][size];

    System.out.println("Addition of matrix:");
    for (i = 0; i < size; i++)
    {
        for (j = 0; j < size; j++)
        {
            C[i][j] = a[i][j] + b[i][j];
            System.out.print(C[i][j]+" ");
        }
        System.out.println("");            
    }         
  }

  public void subtract(int a[][], int b[][],int size) {
    int i, j;
    int C[][] = new int[size][size];

    System.out.println("Subtraction of matrix:");
    for (i = 0; i < size; i++)
    {
        for (j = 0; j < size; j++)
        {
            C[i][j] = a[i][j] - b[i][j];
            System.out.print(C[i][j]+" ");
        }
        System.out.println("");            
    }
  }
}
