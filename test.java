// stuff goes here

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

Lower=0
	Upper=length(nlist)-1
	While(lower<=upper)
		Midpoint=(lower+upper)/DIV2
			If nlist[midpoint]<searchitem then
				Lower=midpoint+1
			Elseif nlist[midpoint]>searchitem then
				Upper=midpoint-1
			Else
				Return true
			End if
	End while
	Return false
End function
