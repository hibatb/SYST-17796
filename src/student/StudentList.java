/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class StudentList {
    
    public static void main(String[] args) {
        
        Student[] s= new Student[2];
        Scanner scan= new Scanner(System.in);
        
        for (int i=0; i<s.length; i++)
        {
            s[i]= new Student();
            System.out.print("Enter id: ");
            s[i].setId(scan.nextInt());
            System.out.print("Enter name: ");
            s[i].setName(scan.nextLine());
        }
    }
}
