public class Solution {
    public int removeElement(int[] A, int elem) {
        // Start typing your Java solution below
        // DO NOT write main() function
        int tail = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] != elem) {
                A[tail] = A[i];
                tail++;
            }
        }
        return tail;
    }
}