class Solution {
    public int peakIndexInMountainArray(int[] A) {
		int left = 0 ,right = A.length -1,mid;
		
		while(left< right){
			//conditions 
			mid = left+right/2;
			// if picked is lessthan go right
			if(A[mid]<A[mid+1]){
				left = mid ;
			//if picked is greter than go left
			}else if(A[mid-1]<A[mid]){
				right = mid;
			//else it's the biggest then returun that idx
			}else{
				return mid;
			}
		}
		return 0; 
		
	}
}


class Solution {
      public int peakIndexInMountainArray(int[] A) {
        int l = 0, r = A.length - 1, mid;
        while (l < r) {
            mid = (l + r) / 2;
            if (A[mid] < A[mid + 1]) l = mid;
            else if (A[mid - 1] > A[mid]) r = mid;
            else return mid;
        }
        return 0;
    }
}