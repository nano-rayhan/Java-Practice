public class margeSort {
    static int count = 0;
    public static void conquer(int arr[],int si, int mid, int ei){
        int marged[] = new int[ei - si +1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;       
        while (idx1 <= mid && idx2 <=ei) {
            if(arr[idx1] <= arr[idx2]){
                marged[x++] = arr[idx1++];               
            }
            else{
                marged[x++] = arr[idx2++];
                count += (mid - idx1 + 1);
            }
        }
        while (idx1 <= mid) {
            marged[x++] = arr[idx1++];
            
        }
        while (idx2 <= ei) {
            marged[x++] = arr[idx2++];
           
        }
        for(int i=0, j=si; i<marged.length; i++, j++){
            arr[j] = marged[i];
            
        }       
    }   
    public static void divide(int arr[], int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);   
    }
    public static void main(String[] args) {
        int arr[] = {6,2,9,4,8,4};
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n Marged Sort: ");
        divide(arr, 0, n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n"+ count);
        System.out.println();
    }
}