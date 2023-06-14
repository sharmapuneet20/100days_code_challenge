public class searchinsertedposition {

    public static int search(int []nums , int target ){
        int start = 0 ;
        int end = nums.length -1;

        while(start <=end){
            int mid = start + (end -start)/2 ;
            if(target > nums[mid]){
                start = mid +1;
            }else if(target < nums[mid]){
                end = mid -1;
            }else{
                return mid ;
            }
        }
        return  start;
    }

    public static void main(String[] args) {
        int arr[] = { 1,3,5,6,7,8};

        int target = 4;
        System.out.println(search(arr,target));
    }



}
