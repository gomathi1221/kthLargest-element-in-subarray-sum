public static int kthLargest(int[] arr, int k) {
        int sum=0;
        int length=(arr.length*(arr.length+1))/2;
        int[] a=new int[length];
        int l=0;
       for(int i=0;i<arr.length;i++){
           sum=0;
           for(int j=i;j<arr.length;j++){
               sum+=arr[j];
               a[l]=sum;
               l++;
           }
       }
       Arrays.sort(a);
       return a[length-k];
        
        
    }