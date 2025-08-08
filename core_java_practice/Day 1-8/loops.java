package wiprodemo;
import java.util.Scanner;
import java.util.Arrays;
public class loops {
	public static void main(String[] args) {
		
		
//		for(int hour=1;hour<=24;hour++)
//		{
//			
//		System.out.println("checking temp , hour:"+hour);
	//
//		}
//		int heartrate=108;
//		while(heartrate>100)
//		{
//			System.out.println("heartrate is high:"+heartrate);
//			heartrate-=2;
//		}
//		System.out.println("normal heart rate");
//		int i=1;
		
//		int balance=10000;
//		int withdraw=2000;
//		do{
//			System.out.println("withdrawn:"+withdraw);
//			balance-=withdraw;
//			System.out.println("remaining balance:"+balance);
//			
//		}while(balance>=withdraw);
//		System.out.println("insufficient balance for next withdrawl");
//		int []arr= {1,2,3,4};
//		int []arr1=new int[4];
		Scanner sc =new Scanner(System.in);
//		for (int i=0;i<arr.length;i++)
//		{
//			System.out.println("index-"+i+":"+arr[i]);
//		}
		
//		 int[][] atm = new int[3][2];
//
//	        System.out.println("Enter denomination and quantity for 3 types of notes:");
//
//	        for (int i = 0; i < 3; i++) {
//	            System.out.print("Enter denomination for note " + (i + 1) + ": ");
//	            atm[i][0] = sc.nextInt();
//
//	            System.out.print("Enter quantity for ₹" + atm[i][0] + " notes: ");
//	            atm[i][1] = sc.nextInt();
//	        }
//
//
//	        System.out.println("\n--- ATM Cash Details ---");
//	        System.out.println("Denomination | Quantity | Amount");
//
//	        for (int i = 0; i < 3; i++) {
//	            int denomination = atm[i][0];
//	            int quantity = atm[i][1];
//	            int amount = denomination * quantity;
//
//	            System.out.println(denomination + " | " + quantity + " | " + amount);
//	        }
//
//	        sc.close();
	        
//	        char[][] rooms = new char[2][4]; 
//
//	        for (int i = 0; i < 2; i++) {
//	            System.out.println("Floor " + (i + 1) + ":");
//	            for (int j = 0; j < 4; j++) {
//	                System.out.print("Room " + (j + 1) + " (A=Available, B=Booked): ");
//	                rooms[i][j] = sc.next().toUpperCase().charAt(0);
//	            }
//	        }
//
//	        System.out.println("\nHotel Room Status:");
//	        for (int i = 0; i < 2; i++) {
//	            System.out.print("Floor " + (i + 1) + ": ");
//	            for (int j = 0; j < 4; j++) {
//	                System.out.print(rooms[i][j] + " ");
//	            }
//	            System.out.println();
//	        }
//
//	        sc.close();
//	        
//	        System.out.print("Enter number of classes: ");
//	        int classes = sc.nextInt();
//
//	        int[][] students = new int[classes][]; // jagged array
//
//	        for (int i = 0; i < classes; i++) {
//	            System.out.print("Enter number of students in Class " + (i + 1) + ": ");
//	            int count = sc.nextInt();
//	            students[i] = new int[count];
//
//	            System.out.println("Enter roll numbers for Class " + (i + 1) + ":");
//	            for (int j = 0; j < count; j++) {
//	                students[i][j] = sc.nextInt();
//	            }
//	        }
//
//	        System.out.println("\nStudent Roll Numbers by Class:");
//	        for (int i = 0; i < classes; i++) {
//	            System.out.print("Class " + (i + 1) + ": ");
//	            for (int j = 0; j < students[i].length; j++) {
//	                System.out.print(students[i][j] + " ");
//	            }
//	            System.out.println();
//	        }
//
//	        sc.close();
//		 System.out.print("Enter number of employees: ");
//	        int empCount = sc.nextInt();
//
//	        int[][] sales = new int[empCount][]; // jagged array
//
//	        for (int i = 0; i < empCount; i++) {
//	            System.out.print("Enter number of sales made by Employee " + (i + 1) + ": ");
//	            int saleCount = sc.nextInt();
//	            sales[i] = new int[saleCount];
//
//	            System.out.println("Enter amounts of each sale:");
//	            for (int j = 0; j < saleCount; j++) {
//	                System.out.print("Sale " + (j + 1) + ": ");
//	                sales[i][j] = sc.nextInt();
//	            }
//	        }
//
//	        // Display report
//	        System.out.println("\nSales Report:");
//	        for (int i = 0; i < empCount; i++) {
//	            int total = 0;
//	            System.out.print("Employee " + (i + 1) + ": ");
//	            for (int j = 0; j < sales[i].length; j++) {
//	                System.out.print(sales[i][j] + " ");
//	                total += sales[i][j];
//	            }
//	            System.out.println(" | Total Sales = " + total);
//	        }
//
//	        sc.close();
//		
//		    String str = "Hello Prakhar";
//	        String str2 = " hello java";
//
//	        System.out.println("Length: " + str.length());
//	        System.out.println("charAt(1): " + str.charAt(1));
//	        System.out.println("substring(2): " + str.substring(2));
//	        System.out.println("substring(2, 7): " + str.substring(2, 7));
//	        System.out.println("concat: " + str.concat(" World"));
//
//	        //Comparison
//	        System.out.println("equals: " + str.equals(str2));
//	        System.out.println("equalsIgnoreCase: " + str.equalsIgnoreCase(str2));
//
//	        //Searching 
//	        System.out.println("indexOf('P'): " + str.indexOf('P'));
//	        System.out.println("lastIndexOf('a'): " + str.lastIndexOf('a'));
//	        System.out.println("contains: " + str.contains("Hello"));
//	        System.out.println("startsWith: " + str.startsWith("He"));
//	        System.out.println("endsWith: " + str.endsWith("r"));
//
//	        // 🔹 Case Conversion
//	        System.out.println("toLowerCase: " + str.toLowerCase());
//	        System.out.println("toUpperCase: " + str.toUpperCase());
//
//	        //Trimming and Replacing
//	        System.out.println("trim:" + str2.trim() + " ");
//	        System.out.println("replace: " + str.replace('a', '@'));
//	        System.out.println("replace: " + str.replace("Prakhar", "World"));
//	        System.out.println("replaceAll: " + str.replaceAll(" ", "_")); // regex
//	        System.out.println("replaceFirst: " + str.replaceFirst(" ", "-"));
//
//	        // Conversion
//	        char[] chars = str.toCharArray();
//	        System.out.println("toCharArray: " + Arrays.toString(chars));
//	        byte[] bytes = str.getBytes();
//	        System.out.println("getBytes: " + Arrays.toString(bytes));
//	        
//	        //split
//	        String [] words = str.split(" ");
//	        System.out.println("splitted into array of words"+Arrays.toString(words));
		
		
		}
}
