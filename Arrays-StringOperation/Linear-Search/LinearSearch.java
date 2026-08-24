import java.util.*;
public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int flag =0;
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<num;i++){
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        for(int i=0;i<num;i++){
            if(arr[i]==k){
                flag = 1;
                break;
            }
        }
        if(flag==1)
            System.out.println("Found");
        else
            System.out.println("Not Found");
    }
}