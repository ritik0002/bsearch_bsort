// stuff goes here
// testing git commit and push

class Test 
{


    public static void main(String[] a) 
    {
        int[] example ={5,10,5,-1,2,30,54,100,0};
        for(int i=0;i<example.length;i++)
        {
            System.out.println(example[i]);
        }
        bubble_sort(example);
        for(int i=0;i<example.length;i++)
        {
            System.out.println(example[i]);
        }


        
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

    public static boolean binarysearch(int[] a,int item)
    {
    int lower = 0; //lower list
	int upper = a.length-1; //upper list
	while(lower<=upper)
    {
		int midpoint=(lower+upper)/2;
			if(a[midpoint]< item)
            {
				lower=midpoint+1;
            }
			else if(a[midpoint]>item)
            {
				upper=midpoint-1;

            }
			else{
				return true;
            }
    }
	return false;
    }

}
