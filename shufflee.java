import java.util.Random;
import java.util.Scanner;

class Shufflee
{
	    public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
	    	System.out.println("Enter the length of the array: ");
	        int[] arr=new int[scan.nextInt()];
	        System.out.println("Enter the elements you want to shuffle: ");
	        for(int i=0;i<arr.length;i++)
	        {
	        	arr[i]=scan.nextInt();
	        }
	        

	        shuffleArray(arr);

	        System.out.print("Shuffled Array: ");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

	    public static void shuffleArray(int[] array) {
	        int n = array.length;
	        Random random = new Random();

	        for (int i = n - 1; i > 0; i--) {
	            int j = random.nextInt(i + 1);

	            // Swap array[i] and array[j]
	            int temp = array[i];
	            array[i] = array[j];
	            array[j] = temp;
	        }
	    }
	}

