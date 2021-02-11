
package ausmolo_act6;

import java.util.Scanner;

public class Ausmolo_Act6 {

    
    public static void main(String[] args) {
        int length;
Scanner input = new Scanner(System.in);

System.out.println("Enter 10 Value: )");
length = 4;
String[] names = new String[length];

for(int counter =0; counter<length; counter++){
System.out.println("Value " + (counter+1));
names[counter] = input.next();
}
input.close();

System.out.println("youyr friend are");
for(int counter =0; counter<length; counter++){
System.out.println(names[counter]);
}


    }
    

