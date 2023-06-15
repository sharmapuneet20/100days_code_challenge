public class findfirstandlastposofelement {
    public static int search_firstocc(int []nums , int target , boolean firstst){
        int start = 0 ;
        int end = nums.length -1;
        int first = -1;

        while(start <=end){
            int mid = start + (end -start)/2 ;
            if(nums[mid] == target){
                first = mid;
                end = mid -1;
            }else if( nums[mid] < target ){
                start = mid +1;

            }else {
                end = mid -1;
            }
        }
       return first ;
    }

    public static int search_lastocc(int []nums , int target , boolean lastst){
        int start = 0 ;
        int end = nums.length -1;
        int last = -1;

        while(start <=end){
            int mid = start + (end -start)/2 ;
            if(nums[mid] == target){
                last = mid;
                start = mid +1;
            }else if( nums[mid] < target ){
                start = mid +1;

            }else {
                end = mid -1;
            }
        }
        return last ;
    }
    public static int[] searchRange(int[] nums, int target) {
    int[] ans = {-1, -1};
    ans[0] = search_firstocc(nums, target, true);
        if (ans[0] != -1) {
        ans[1] = search_lastocc(nums, target, false);
    }
        return ans;



    }





    public static void main(String[] args) {
        int []arr = {5,7,7,8,8,10};
        int target = 8 ;
        System.out.println(searchRange(arr,target));

    }
}
