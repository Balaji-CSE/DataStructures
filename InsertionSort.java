import java.util.Arrays;
public class InsertionSort {
    public static void main(String[] args) {
        int a[] = {20,5,15,40,60,55};
        System.out.println(Arrays.toString(a));
        for(int i=1;i<a.length;i++)
        {
            int key = a[i];
            int j=i-1;
            while(j>=0 && a[j]>key)
            {
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        System.out.println(Arrays.toString(a));
    }
}
