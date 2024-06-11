package corecoTask.com;

public class FindHightest {

    public static void main(String[] args) 
    {
        int[] array1 = {-1, 3, 5, 6, 99, 12, 2};
        int[] array2 = {6, 7, 8};
        
        System.out.println("Highest integer in array1: " + findHighest(array1));
        System.out.println("Highest integer in array2: " + findHighest(array2));
    }

    public static int findHighest(int[] arr)
    {
        return findHighestHelper(arr, 0);
    }

    public static int findHighestHelper(int[] arr, int index)
    {
        if (index == arr.length - 1) 
        {
            return arr[index];
        }

        int restMax = findHighestHelper(arr, index + 1);

        return (arr[index] > restMax) ? arr[index] : restMax;
    }
}


/************OUTPUT******************

Highest integer in array1: 99
Highest integer in array2: 8

*/