public class MathUtil
{
    public int maxInt(int arr[])
    {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }

    public int minInt(int arr[])
    {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i]<min)
            {
                min = arr[i];
            }  
        }
        return min;
    }

    public static void main(String[] args)
    {
        int[] arr = {45, 12, 78, 3, 56, 89, 21};

        MathUtil obj = new MathUtil();

        System.out.println("Max int: " + obj.maxInt(arr));
        System.out.println("Min int: " + obj.minInt(arr));


    }
}
