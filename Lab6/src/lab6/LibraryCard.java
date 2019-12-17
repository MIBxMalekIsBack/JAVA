/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;


public class LibraryCard {
     //Data member
    private Student owner;//student owner of this card
    private int borrowCnt;//number of book borrowed
    
    //numOfBooks are checked out
    public void checkOut(int numOfBooks){
        borrowCnt = borrowCnt + numOfBooks;
    }
    
    //Return the name of the owner of this card
    public String getOwnerName(){
        return owner.getName();
    }
    //return the number of books borrowed
    public int getNumberOfBooks(){
        return borrowCnt;
    }
    //Sets the owner of this card to student
    public void setOwner(Student student){
        owner = student;
    }
    //Return the string representation of this card
    public String toString(){
        return "Owner Name:     " + owner.getName() + "\n" +
               "     Email:     " + owner.getEmail() + "\n" +
                "Books Borrowed: " + borrowCnt;
    }
}
