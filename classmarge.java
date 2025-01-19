import java.util.ArrayList;

public class classmarge {
    public static void conquer(int arr[], int si, int mid, int ei){
        int marged[] = new int[ei - si +1];
        int ivscount = 0;
        int idx1 = si;
        int idx2 = mid + 1;
        int x = 0;
        while (idx1 <= mid && idx2 <= ei) {
            if(arr[idx1] <= arr[idx2]){
            marged[x] = arr[idx1];
            x++;
            idx1++;
            ivscount++;
          }
          else{
            marged[x] = arr[idx2];
            x++;
            idx2++;
            ivscount++;
          }
        }

        while (idx1 <= mid) {
            marged[x] = arr[idx1];
            x++;
            idx1++;
            ivscount++;
        }
        while (idx2 <= ei) {
            marged[x] = arr[idx2];
            x++;
            idx2++;
            ivscount++;
        }
        for(int i=0,j=si;i<marged.length;i++,j++){
            arr[j] = marged[i];
            
        }
        System.out.println(ivscount);
        
    }

    public static void divide(int arr[],int si, int ei ){
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int arr[] = {4,2,6,1,8,5};

        int n = arr.length;
        divide(arr, 0, n-1);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
