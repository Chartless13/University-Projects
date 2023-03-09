
package Tutors;

import GUI.Person;
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
 * @author Chris Hartless
 */
public class Tutor extends Person {
    
	private String office;
	private String expertise;
	private String position;
	private String status;
        List<Tutor> list = new ArrayList<Tutor>();
	
        //Tutor constructor

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
     */
	public Tutor(String fName, String lName, String DOB,String Address, String office, String expertise, String position, String status) {
		super(fName, lName, DOB, Address);
		this.office = office;
		this.expertise = expertise;
		this.position = position;
		this.status = status;
	}
        //Getters and setters
        public void setOffice(String Office) {
		this.office = Office;
	}
        
        public String getOffice() {
		return this.office;
	}  
        
        public void setExpertise(String expertise) {
		this.expertise = expertise;
	}
        
        public String getExpertise() {
		return this.expertise;
	}  
        
        public void setPosition(String position) {
		this.position = position;
	}
        
        public String getPosition() {
		return this.position;
	}
        
        public void setStatus(String status) {
		this.status = status;
	}
        
        public String getStatus() {
		return this.status;
	}
        
    /**
     *
     * @param t
     */
    public void tutorSerialization(Tutor t) {
       //gets list from file and copies it so list is kept
     try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("tutors.txt"));
       
        List<Tutor> tutorList = (List<Tutor>) in.readObject();
       
        for (Tutor tutor : tutorList) {
        System.out.println(tutor.getFirstName());
            list.add(tutor);
        
    }
        
    } catch (IOException ex) {
        Logger.getLogger(Tutor.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Tutor.class.getName()).log(Level.SEVERE, null, ex);
    }
     
     //adds student passed in to the list
     try {
      list.add(t);
     
     }catch (Exception e) {
          e.printStackTrace();
      }
     

    //writes the list to the file
    try {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tutors.txt"));
        out.writeObject(list);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Tutor.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Tutor.class.getName()).log(Level.SEVERE, null, ex);
    }
    
     }
        
        
        //Method that gets the list of Tutors

    /**
     *
     * @return
     */
        public static List getList(){
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("tutors.txt"));
                List<Tutor> tutorList = (List<Tutor>) in.readObject();
                return tutorList;
            } catch (IOException ex) {
                Logger.getLogger(Tutor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
               Logger.getLogger(Tutor.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
        }
        
        //Method that updates list of Tutors

    /**
     *
     * @param updateList
     */
        public static void updateList(List updateList) {
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("tutors.txt"));
                out.writeObject(updateList);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Tutor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Tutor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
	
}
