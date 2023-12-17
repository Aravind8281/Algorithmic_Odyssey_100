static int BinaryArray(int[] arr,int target){
      int low = 0;
      int high = arr.length - 1;
      int mid;
      while (low <= high) { 
          mid = low + (high - low) / 2; 
          if (arr[mid] == target) {
              return mid;
          } else if (arr[mid] < target) {
              low = mid + 1;
          } else {
              high = mid - 1;
          }
      }
    return -1;  
}
