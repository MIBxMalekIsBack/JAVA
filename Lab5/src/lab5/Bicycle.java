/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

/**
 *
 * @author ABDUL MALEK
 */
public class Bicycle {
    private String ownerName;
        public Bicycle()
        {
            ownerName = "Unassigned"; //initialization
        }
        public String getOwnerName()
        {
            return ownerName;
        }
        public void setownername(String name)
        {
            ownerName = name;
        }
        public void setOwnerName(String name){
            ownerName = name;  
    }
}
