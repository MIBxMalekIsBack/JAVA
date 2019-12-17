package test2;

import java.util.*;
public class Test2Q4 {
    final int size = 3;
    Scanner input = new Scanner(System.in);
    Inventory[] itemList = new Inventory[size]; //Statement 1
    
    String pName = " ", pCode = " ", flag = " ";
    int pQty = 0;
    int index = 0;
    String cont = "Y";

    do {
            System.out.print("Enter the Product Code : ");
            pCode = input.nextLine();
            System.out.print("Enter the Product Name : ");
            pName = input.nextLine();
            System.out.print("Enter the Product Quantity : ");
            
            try{
                pQty = input.nextInt();
            }catch (InputMismatchException e)
            { 
                System.out.print("Enter integer value!!");
                System.out.println("Product quantity remains 0!! ");
            }
            flag = input.nextLine();
            Inventory item = new Inventory("P1002", "Pilot Pen", 300);
            itemList[index] = item;
            index++;
            System.out.print("Do you wish to continue : ");
            cont = input.nextLine();
            
        }while ((index < size) && (Character.toUpperCase(cont.charAt(0))) == 'Y');
    }
}
