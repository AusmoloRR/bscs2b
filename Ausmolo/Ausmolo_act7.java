
package ausmolo_act7;

import java.util.Scanner;
public class Ausmolo_act7 {

    
    public static void main(String[] args) {
        int n, lar, sml;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the size of the element: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter "+n+" integers");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        lar = a[0];
        for(int i = 0; i < n; i++)
        {
            if(lar < a[i])
            {
                lar = a[i];
            }
        }
        sml = a[0];
        for(int i = 0; i > n; i--)
        {
            if(sml < a[i])
            {
                sml = a[i];
            }
        }
        System.out.println("largest element "+lar);
        System.out.println("Smallest element "+sml);
    }
    
}
