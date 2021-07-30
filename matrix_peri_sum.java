import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner read = new Scanner(System.in);
//        int m,n;
//        m=read.nextInt();
//        n=read.nextInt();
//        System.out.println(m+" "+n);
      int[][] mat={{1,2,3,4,5,6},{7,8,9,10,11,12},{13,14,15,16,17,18},{19,20,21,22,23,24},{25,26,27,28,29,30}};
      int sum=0;
      
      
    System.out.println("matrix row= "+mat.length);
    System.out.println("matrix column= "+mat[0].length);
    double row=(mat.length)/2;
    double col=(mat[0].length)/2;
//    System.out.println(""+col);
    if(row%1==.5){row-=.5;}
    if(col%1==.5){col-=.5;}
    int row_len=(int)row;
    int col_len=(int)col;

//    System.out.println("row mid= "+row_len);        
//    System.out.println("col mid= "+col_len);
    int mat_row=mat.length;
    int mat_col=mat[0].length;
    
    System.out.println("\n");


    int sum1=0;

      for (int i=0; i<mat_row;i++){
          for (int j=0; j<mat_col;j++){//System.out.println(mat[i][j]);
              
               if(i==0 || i==(mat_row-1) ) { 
                   /* add only the first and last row of the matrix*/
                   sum+=mat[i][j];System.out.println(mat[i][j]); 
               }
               else if( j==0 || j == (mat_col-1)) { 
                   /* add the first and last column ignoring the top and bottom row */
                   sum+=mat[i][j];System.out.println(mat[i][j]);
               }
              
          }System.out.println();
      } 
      System.out.println("Sum of the perimeter values of the matrix is = " + sum);
    }
}
