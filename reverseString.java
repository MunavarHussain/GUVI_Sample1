import java.util.Scanner;
public class reverseString{

    public static void main(String[] args){
//*****DECLARATIONS
        Scanner s = new Scanner(System.in); // Declaring scanner class for input
        int j=0;
//Getting input from the user
        System.out.println("Enter a string"); 
        String rev = s.nextLine();
//declaring arrays        
char[] rv = new char[rev.length()];
char temp[] = new char[rev.length()];
//String ->> Array
rv=rev.toCharArray();
//Loop to reverse the characters in the array
for(int i=rev.length()-1;i>=0;i--){
  temp[j]=rv[i];
  j++;
}
//Printing the reversed array as a String
System.out.println(new String(temp));
}



}