import java.util.*;
public class BinarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int key = sc.nextInt();
        int first =0,last= n-1;
        while(first<=last){
            int mid = (first+last)/2;
            if(arr[mid]==key){
                System.out.println("Element Found");
                return;
            }
            else if(key<arr[mid]){
                last = mid-1;
            }
            else{
                first = mid+1;
            }
        }
        System.out.println("Element Not Found");
    }
}
