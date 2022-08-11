public class trappingrainwater {
    // {0,1,0,2,1,0,1,3,2,1,2,1}
    // left=0---------->1
    // right=1--------->0
    public static int maxwater(int[] arr,int n){
        int res=0;
        for(int i=1; i<n-1; i++){
            int left=arr[i];
            for(int j=0; j<i; j++){
                left=Math.max(left, arr[j]);
            }
            int right=arr[i];
            for(int j=i+1; j<n; j++){
                right=Math.max(right, arr[j]);
            }
            res += Math.min(left, right)-arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int arr[]={0,1,0,2,1,0,1,3,2,1,2,1};
        int n=arr.length;
        System.out.println(maxwater(arr, n));
    }
}
