package pr1_w;
import java.util.Scanner;


class Derivative{
	
	public void zad1() {
		boolean run=true;
		
		while(run==true) {
			System.out.println("\nYou selected the derivative of the function y=a√x;\n (e.g. y=15√x;)");
		
			System.out.println("Enter the number 'a'(float)");	
			float a = getFloatInput();
		
			float part1=makeCalc1(a);	
			System.out.println("df = "+part1+"/√x;\n");

			System.out.println("Press 'y' if you want to continue or press any other key if not");
			Scanner sc3 = new Scanner(System.in);
			String choice1 = sc3.nextLine();
			if(!choice1.equals("y")) {
				run=false;
			}
		}		
	}
	
	public void zad2() {
		boolean run=true;
		
		while(run==true) {
			System.out.println("\nYou selected the derivative of the function y=a√x + bx^p + cx^q;\n(e.g. y=3√x + 2x^8 + 12x^6;)");
			
			System.out.println("Enter the number 'a'(float)");
			float a = getFloatInput();
			System.out.println("Enter the number 'b'(float)");
			float b = getFloatInput();
			System.out.println("Enter the number 'c'(float)");
			float c = getFloatInput();
			System.out.println("Enter the number 'p'(int)");
			int p =  getIntInput();
			System.out.println("Enter the number 'q'(int)");
			int q =  getIntInput();
		
			float part1=makeCalc1(a);
			float part2=makeCalc2(b,p);
			float part3=makeCalc2(c,q);
			int part4=makeCalc3(p);
			int part5=makeCalc3(q);
			System.out.println("df ="+part1+"/√x + "+part2+"x^"+part4+" + "+part3+"x^"+part5+";\n");
		
			System.out.println("Press 'y' if you want to continue or press any other key if not");
			Scanner sc3 = new Scanner(System.in);
			String choice1 = sc3.nextLine();
			if(!choice1.equals("y")) {
				run=false;
			}
		}
	}
	
	public void zad3() {
		boolean run=true;
		
		while(run==true) {
			System.out.println("\nYou selected the derivative of the function y=a/x^p;\n (e.g.y=3/x^5;)");
		
			System.out.println("Enter the number 'a'(float)");
			float a =getFloatInput();
			System.out.println("Enter the number 'p'(int)");
			int p =  getIntInput();

			float part1=makeCalc2(a,p);
			float part2=makeCalc5(part1);
			int part3=makeCalc4(p);
			System.out.println("df =" +part2+"/x^"+part3+";\n");
		
			System.out.println("Press 'y' if you want to continue or press any other key if not");
			Scanner sc3 = new Scanner(System.in);
			String choice1 = sc3.nextLine();
			if(!choice1.equals("y")) {
				run=false;
			}
		}		
	}
	
	public int getIntInput() {
    	
        int number = 0;
        boolean run = true;
		Scanner sc2 = new Scanner(System.in);

        while (run==true) {
            if (sc2.hasNextInt()) {
                number = sc2.nextInt();
                run = false;          
            } else {
                System.out.println("Please enter a valid  number!");
                sc2.next();
            }
        }
        return number;
    }
    
	
    public float getFloatInput() {
        float number = 0;
        boolean run = true;
		Scanner sc2 = new Scanner(System.in);

        while (run==true) {
            if (sc2.hasNextFloat()) {
                number = sc2.nextFloat();
                run = false;
            } else {
                System.out.println("Please enter a valid number!");
                sc2.next();
            }
        }
        return number;
    }
    
    
    
	public float makeCalc1(float a) 
	{
		float res = a/2;
		return res;
	}
	
	public float makeCalc2(float b, int p) 
	{
		float res = b*p;
		return res;
	}
	
	public int makeCalc3(int p) 
	{
		int res = p-1;
		return res;
	}
	
	public int makeCalc4(int p) 
	{
		int res = p+1;
		return res;
	}
	
	public float makeCalc5(float a) 
	{
		float res = a*-1;
		return res;
	}
}


public class Main {
	
	public static void main(String[] args) {

		System.out.println("\t\tProject Nr1 Derived functions\n");
		Derivative der01 = new Derivative();
		
		boolean run = true;	
		while (run==true) {	
				
			System.out.println("\nProgram menu (select the number on the keyboard):\n " 
			        +"1) y=15√x;\n " 
			        +"2) y=3√x + 2x^8 + 12x^6;\n " 
			        +"3) y=3/x^5;\n " 
			        +"4) End the program;");
				
			Scanner sc1 = new Scanner(System.in);
			String choice = sc1.nextLine();
			
			switch (choice) {
			case "1":
				der01.zad1();
				break;
			case "2":
				der01.zad2();
				break;
			case "3":
				der01.zad3();
				break;
			case "4":
				System.out.println("The program is ended");
				run=false;
				break;
			default:
				System.out.println("Incorrect number, try again!");
				break;
			}		
		}
		
		
	}
}