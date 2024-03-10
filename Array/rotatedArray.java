package Array;

class Array{
    public void search(int[] nums, int target) {
        int start = 0; 
        int peak = peakElement(nums); 
        int firstTry = searchAgnosticBinary(nums, target , start , peak);
        System.out.println(firstTry);
        
    }
    public int peakElement(int[] nums){
        int start = 0 ; 
        int end = nums.length - 1; 
        while(start < end){
            int mid = start + (end - start) / 2 ; 
            if(nums[mid] < nums[mid + 1]){
                start = mid + 1 ; 
            }
            else{
                end = mid ; 
            }
        }
        return start ; 
    }

    public int searchAgnosticBinary(int[] arr, int target , int start , int end){        
        boolean isAsc = arr[start] < arr[end]; 
        while(start <= end){
            int mid = start + (end - start) / 2 ; 
            if(arr[mid] == target){
                return mid; 
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1; 
                }
                else{
                    start = mid + 1 ; 
                }
            }
            else{
                if(target < arr[mid]){
                    start = mid + 1 ; 
                }
                else{
                    end = mid - 1; 
                }
            }

        }
            return -1 ; 
    }

    public static void main(String[] args){
        Array  a = new Array();
        int[] as = { 3 , 2 , 1 };
        a.search(as , 2);
    }
}