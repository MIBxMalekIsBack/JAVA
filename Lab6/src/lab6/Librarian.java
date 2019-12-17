/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

public class Librarian {
     public static void main(String[] args){
        Student student;
        LibraryCard card1, card2;
        student = new Student();  //constuctor method activate
        student.setName("Jon Java");
        student.setEmail("jj@javauniv.edu");
        card1 = new LibraryCard();
        card1.setOwner(student);
        card1.checkOut(3);
        card2 = new LibraryCard();
        card2.setOwner(student); //the same student is the owner
                                 //of the second card too
        System.out.println("Card1 Info:");
        System.out.println(card1.toString() + "\n");
        System.out.println("Card2 Info");
        System.out.println(card2.toString() + "\n");
    }
}
