// stuff goes here
test
// testing git commit and push

public class Test {


    public static void main(String[] a) 
    {

    }

    public static void bubble_sort(int[] a)
    {
        int l = a.length;
        int temp;
        for (int i = 0; i < l; i++)
        {
            for (int j = 1; j < (l - i); j++)
            {
                if (a[j - 1] > a[j])
                {
                    temp = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}
