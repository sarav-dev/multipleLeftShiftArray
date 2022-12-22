package MultipleLeftShift;

import java.util.*;

public class multipleLeftShiftArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner (System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for (int i=0; i<N; i++) {
            A[i] = sc.nextInt();
        }
        int M = sc.nextInt();
        int[] B = new int[M];
        for (int i=0; i<M; i++) {
            B[i] = sc.nextInt();
        }
        int res[][] = solve(A, B);
        for (int i=0; i<M; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(res[i][j] + " ");
            }
			System.out.println();
        }
        sc.close();
    }
    
    public static int[][] solve(int[] A, int[] B) {
        int rotateArray[][] = new int[B.length][A.length];
        for (int i =0; i<B.length; i++){
            int rotateArrayIndex = 0;
            int index= B[i] % A.length;
            //we will be adding element from B lets take input 1 
            // [3, 4, 5, 0, 0]
            while ( index <A.length){
                rotateArray[i][rotateArrayIndex] = A[index];
                index++; rotateArrayIndex++;
            }
            // [3, 4, 5, 1, 2]
            index = 0;
            while ( index < B[i]%A.length){
                rotateArray[i][rotateArrayIndex] = A[index];
                
                index++; rotateArrayIndex++;
            }
        }
        return rotateArray;
    }
}