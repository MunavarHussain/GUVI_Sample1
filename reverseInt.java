import java.util.Scanner;
public class reverseInt{
public static void main(String[] args){

    Scanner s= new Scanner(System.in); //Scanner declaration
    
    System.out.println("Enter a interger"); //Message to get input
    try
    {
//*****Declarations
        int num = s.nextInt(); //accepting integer input  :)
        int t2=0,i=1;
    
//Loop to determine the max digit of the input
    for(int t1=num/10;t1!=0;t1/=10)
    i*=10;
    //max digit stored in i 
    
    while(num!=0)
    {
    t2+=( i*(num%10) );
    num/=10;
    i/=10;
    }
System.out.println(t2);
    }
    catch (Exception e)    //to avoid exceptional error
    {System.out.println("Error in input");}
    
    
}

}

