
package Academics;

import GUI.Person;
import Students.Student;
import Tutors.Tutor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christopher Hartless
 */
public class Academic extends Tutor {



        //Initiates anything that is needed
        private String research;
        List<Academic> list = new ArrayList<Academic>();
	
        //Academic Constructor

    /**
     *
     * @param fName
     * @param lName
     * @param DOB
     * @param Address
     * @param office
     * @param expertise
     * @param position
     * @param status
     * @param research
     */

	public Academic(String fName, String lName, String DOB,String Address, String office, String expertise, String position, String status, String research) {
		super(fName, lName, DOB, Address, office, expertise, position, status);
                this.research = research;
	}
        //Getters and Setters
        
         /**
          * describe method
          * @param research  a string provided by user
          * 
          */
        public void setResearch(String research) {
		this.research = research;
	}
        
        /**
         * 
         * @return return 
         */
        public String getResearch() {
                
		return this.research;
	}
        
        
        
        public void AcademicSerialization(Academic a) {
       //gets list from file and copies it so list is kept
     try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("academic.txt"));
       
        List<Academic> academicList = (List<Academic>) in.readObject();
       
        for (Academic academic : academicList) {
        System.out.println(academic.getFirstName());
            list.add(academic);
        
    }
        
    } catch (IOException ex) {
        Logger.getLogger(Academic.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Academic.class.getName()).log(Level.SEVERE, null, ex);
    }
     
     //adds student passed in to the list
     try {
      list.add(a);
     
     }catch (Exception e) {
          e.printStackTrace();
      }
     

    //writes the list to the file
    try {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("academic.txt"));
        out.writeObject(list);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Academic.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Academic.class.getName()).log(Level.SEVERE, null, ex);
    }
           

    
    
            
    

    //if you want to add to list you will need to add to byteList and write it again
    
     }
        //Method to get the list from the file
        public static List getList(){
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("academic.txt"));
                List<Academic> academicList = (List<Academic>) in.readObject();
                return academicList;
            } catch (IOException ex) {
                Logger.getLogger(Academic.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Academic.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }
        //Method to update the file
        public static void updateList(List updateList) {
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("academic.txt"));
                out.writeObject(updateList);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Academic.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Academic.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
	
}


