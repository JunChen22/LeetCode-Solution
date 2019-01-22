class Solution {
    public int[] sortedSquares(int[] A) {
        int len = A.length;
        int[] result = new int[len];
        for(int i = 0 ; i < A.length;i++){
            result[i] = A[i] * A[i];
        }
        Arrays.sort(result);
        return result;
    }
}
