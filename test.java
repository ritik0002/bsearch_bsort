// stuff goes here
// testing git commit and push

public class Test {


    public static void main(String[] a) 
    {
        int[] example = new int[]{ 5,2,9,-2,0,50,10,-24 }
        bubble_sort(example);
        for(int i=0;i<example.length;i++){
            System.out.println(example[i];)
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

}

public static boolean binarysearch(int[] a,int item){
    int lower=0; //lower list
	int upper=length(a)-1; //upper list
	While(lower<=upper){
		int midpoint=(lower+upper)/2;
			If(a[midpoint]< item){
				lower=midpoint+1;
            }
			else if a[midpoint]>item){
				upper=midpoint-1;
            }
			else{
				return true;
            }
    }
	return false;
}
