//ASSIGNMENT 01
//Operations on Complex Number 
import java.util.Scanner;

class complex_operation
{

    private
    float real;
    float imag;
    public
    complex_operation()     //no argument constructor
    {
        real=0;
        imag=0;
    }
    complex_operation(float comp1,float comp2)  //objects as parameters to the constructor     
    {
        real=comp1;
        imag=comp2;
    }
    //methods for various arithmatic operators 
    public
    void  addition(complex_operation C1,complex_operation C2)
    {
        float real,imag;
        real = (C1.real + C2.real); 
        imag = (C1.imag + C2.imag);
        System.out.println("The Answer is:("+real+") + ("+imag+")i" );
    }
    void substraction(complex_operation a, complex_operation b)
    {
        real=(a.real-b.real);
        imag=(a.imag-(b.imag));
        System.out.println("The Answer is =("+real+")+("+imag+")i \n");

    }
    void multiplication(complex_operation a,complex_operation b)
    {
        real=(a.real*b.real-a.imag*b.imag);
        imag=(a.real*b.imag+a.imag*b.real);
        System.out.println("The Answer is =("+real+")+("+imag+")i \n");
    }
    void div(complex_operation a, complex_operation b)
    {
        real=(a.real*b.real+a.imag*b.imag)/((b.real*b.real)+(b.imag*b.imag));
        imag=-(a.real*b.imag-a.imag*b.real)/((b.real*b.real)+(b.imag*b.imag));
        System.out.println("The Answer is =("+real+")+("+imag+")i \n");
    }
}

//defining the class complex
public class Complex {
    public static void main(String[] args) 
    {
    	float num1, num2,num3,num4;		
    	complex_operation operation = new complex_operation();
    	Scanner input =  new Scanner(System.in);
        System.out.print("Enter the real part and imaginary part of the first complex number : ");
	    num1 = input.nextInt(); /*Real part*/ 
        num2 = input.nextInt(); //Imaginary Part
	    complex_operation obj1  = new complex_operation(num1,num2);
        System.out.print("Enter the real part and imaginary part of the second complex number : ");
	    num3 = input.nextInt(); //Real Part
    	num4 = input.nextInt(); //Imaginary Part
	    System.out.println("\nThe first complex no is :"+num1+"+i("+num2+")");
	    System.out.println("The second complex no is :"+num3+"+i("+num4+")");
        complex_operation obj2  = new complex_operation(num3,num4);

        System.out.println("Performing Arithmatic Operations on Complex numbers");
        System.out.println("1.Add");
        System.out.println("2.Substract");
        System.out.println("3.Multiply");
        System.out.println("4.Division");
        System.out.println("5.Exit");
        System.out.println("Choose your choice:");
        input.nextLine();
        char c;
        c=input.nextLine().charAt(0);
        
        //using *switch case* to consider choice of user egarding operation to be performed 
        switch(c)
        {
            case '1':
            operation.addition(obj1, obj2);
            break;
            
            case '2':
            operation.substraction(obj1, obj2);
            break;

            case '3':
            operation.multiplication(obj1, obj2);
            break;
            case '4':
            operation.div(obj1, obj2);

            default :
            System.out.println("Please choose a valid operator");
            break;
        }
        input.close();
        
    }
    
}
