package corecoTask.com;

public class Convenient_Store {

    public static void main(String[] args) {
        int[] notes = {1, 2, 3, 4}; 
        int price = 1000; //price example

        String result = canPurchase(notes, price);
        System.out.println(result);
    }

    public static String canPurchase(int[] notes, int price)
    {
        
        int[] values = {10, 50, 100, 200};
        int totalAmount = 0;

        // Calculate the total amount of money
        for (int i = 0; i < notes.length; i++) 
        {
            totalAmount += notes[i] * values[i];
        }

        // Check if the total amount is sufficient to buy the item
        if (totalAmount >= price)
        {
            return "I can purchase";
        }
        else {
            return "I need more money";
        }
    }
}
/***************OUTPUT*************
 I can purchase
 
 */

