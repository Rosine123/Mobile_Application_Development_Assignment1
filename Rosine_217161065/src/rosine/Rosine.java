/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rosine;

import java.util.Scanner;

/**
 *
 * @author Teacher
 */
public class Rosine {
    
    static int No;
    static String Employee ;
    static int salary;
    static int hours;
    
    static void getdata()
    {
        Scanner k = new Scanner (System.in);
        int op;
        System.out.println("select option:[1]monthly,[2]weekly,[3]hourly");
        op=k.nextInt();
        
        if(op==1){
        System.out.println("Enter Employee number");
        No = k.nextInt();
        
        System.out.println("enter Employee name");
        Employee= k.next();
        
        System.out.println("enter Employee salary");
        salary=k.nextInt();
        
        int result;
        result=salary -(((salary*30)/100)+((salary*3)/100)+((salary*5)/100));
        System.out.println("The Salary of " + Employee + " Employee with No='" + No + "' will get '"+result + "' Per Month");
        }
        else if(op==2){
        System.out.println("enter Employee number");
        No = k.nextInt();
        
        System.out.println("enter Employee name");
        Employee = k.next();
        
        System.out.println("enter Employee salary");
        salary = k.nextInt();
        int result;
        result= salary - ((salary*3)/100);
        System.out.println("The Salary of " + Employee + " Employee with No='" + No + "' will get '"+result + "' Per Week");
        }	
        else if(op==3){
        System.out.println("enter Employee number");
        No = k.nextInt();
        
        System.out.println("enter Employee name");
        Employee = k.next();
        
        System.out.println("enter hourly rate");
        salary = k.nextInt();
        
        System.out.println("enter hours");
        hours = k.nextInt();

        int result;
        result = salary*hours;
            System.out.println("The Salary of " + Employee + " Employee with No='" + No + "' will get '"+result + "' Per Hour");	
        }
        else{
            System.out.println("Invalid option!");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        getdata();
    }
    
}
