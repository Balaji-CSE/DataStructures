import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int a[] = {20,10,40,5,22,55,15};
        for(int i=0;i<a.length-1;i++)
        {
            int min_index = i;
            for(int j=i+1;j<a.length;j++)
            {
                if(a[j]<a[min_index])
                {
                    min_index = j;
                }
            }
            if(min_index!=i){
                int temp = a[min_index];
                a[min_index] = a[i];
                a[i] = temp;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
