
package GUI;
import java.io.Serializable;
import java.util.UUID;
import java.util.*;

/**
 *
 * @author Chris Hartless
 */
public class Person implements Serializable {
	
	private String firstName;
	private String lastName;
	private String DOB;
        private String Address;
	private String ID;
        private List<String> Modules = new ArrayList<String>();
	//Person Constructor

    /**
     *
     * @param fName the firstName of this person
     * @param lName the lastName of this person
     * @param DOB the date of birth of this person
     * @param address the address of this person
     */
	public Person (String fName, String lName, String DOB, String address) {
		this.firstName = fName;
		this.lastName = lName;
		this.DOB = DOB;
		setID();
                this.Address = address;
                
	}
	
	
        //Getters and Setters

    /**
     *
     * @return the firstName of this person
     */
	public  String getFirstName() {
		return this.firstName;
	}

    /**
     *   sets the string the user has entered equal to this person's firstName
     * @param firstName the name the user has entered to be a persons firstName
     */
    public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
    /**
     *
     * @return the lastName of this person
     */
    public String getLastName() {
		return this.lastName;
	}
	
    /**
     * sets the string the user has entered equal to this person's lastName
     * @param lastName the name the user has entered to be a persons lastName
     */
    public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
     *
     * @return the DOB of this person
     */
	public String getDOB() {
		return this.DOB;
	}
	/**
     * sets the date of birth the user has entered equal to this person's DOB
     * @param DOB the date of birth the user has entered 
     */
	public void setDOB(String DOB) {
		this.DOB = DOB;
	}
        
    /**
     *
     * @return the address of this person
     */
    public String getAddress() {
		return this.Address;
	}
	/**
     * sets the Address the user has entered equal to this person's address
     * @param Address the address the user has entered 
     */
	public void setAddress(String Address) {
		this.Address = Address;
	}
	
    /**
     *
     * @return the ID of this person
     */
    public String getID() {
		return this.ID;
	}
	/**
     * sets the ID created equal to this person's IDs
     * 
     */
	public void setID() {
		UUID idOne = UUID.randomUUID();
	    ID = idOne.toString();
	}
        
    /**
     * adds the module to the students list of modules
     * @param Module the Module that has been added to a student
     */
    public void setModules(String Module) {
            this.Modules.add(Module);
        }
        
    /**
     * removes the module from the students list of modules
     * @param Module the Module that has been removed to a student
     */
    public void removeModules(String Module) {
            this.Modules.remove(Module);
        }
        
    /**
     *
     * @return the list of modules from this student
     */
    public String getModules() {
            String modules = "";
            for (int i = 0; i < Modules.size(); i++) {
            modules = modules + Modules.get(i) + ", ";
            }
            
            return modules;
        }
        
        @Override
        public String toString () {
            return this.firstName + " " + this.lastName;
        }
        
        

}






