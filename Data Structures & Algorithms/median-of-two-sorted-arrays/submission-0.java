class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
     
        

        int[] nums3 = new int[m+n];

        for(int i=0;i<nums1.length;i++){
            nums3[i]=nums1[i];
        }
        for(int j=0;j<nums2.length;j++){
            nums3[m+j]=nums2[j];
        }
        Arrays.sort(nums3);

        int len = nums3.length;
        int mid = len / 2;

        if(len%2!=0){
            return nums3[mid];
        }
        else{
            return ((double)nums3[mid-1]+nums3[mid])/2;
        }
        
    }
    
}
