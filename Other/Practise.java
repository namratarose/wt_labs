// //Taking input using Console class
// import java.io.Console;
// public class Practise {
//     public static void main(String[] args) {
//         Console c=System.console();
//         System.out.println("Enter your name:");
//         int n=Integer.parseInt(c.readLine());
//         System.out.println("Welcome "+(n+2));
//     }
// }


// // Java Program for jagged array
// class Practise{
//     public static void main(String[] args) {
//         int[][] jaggedArray=new int[5][];
//         jaggedArray[0]=new int[1];
//         jaggedArray[1]=new int[2];
//         jaggedArray[2]=new int[3];
//         jaggedArray[3]=new int[4];
//         jaggedArray[4]=new int[5];

//         System.out.println("Length:"+jaggedArray.length);
//         int value=1;
//         int i,j;
//         for(i=0;i<jaggedArray.length;i++){
//             for(j=0;j<jaggedArray[i].length;j++)
//             {
//                 jaggedArray[i][j]=value;
//                 value++;
//             }
//         }
//         for(i=0;i<jaggedArray.length;i++){
//             for(j=0;j<jaggedArray[i].length;j++)
//             {
//                 System.out.print(jaggedArray[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

