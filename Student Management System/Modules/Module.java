
package Modules;

import Students.Student;
import GUI.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chris Hartless
 */
public class Module implements Serializable{
    
        //Initiates anything that is needed
	private String Leader;
	private String Moderator;
	private String moduleName;
	private String moduleCode;
	private List<Student> Students = new ArrayList<Student>();
        private List<Result> resultList = new ArrayList<Result>();
        List<Module> list = new ArrayList<Module>();
	//Module Constructor

    /**
     *
     * @param Leader
     * @param Moderator
     * @param moduleName
     * @param moduleCode
     */
	public Module (String Leader, String Moderator, String moduleName, String moduleCode) {
		this.Leader = Leader;
		this.Moderator = Moderator;
		this.moduleCode = moduleCode;
		this.moduleName = moduleName;
	}
	//Getters and Setters
	public String getLeader() {
		return this.Leader;
	}

	public void setLeader(String Leader) {
		this.Leader = Leader;
	}
	
	public String getModerator() {
		return this.Moderator;
	}

	public void setModerator(String Moderator) {
		this.Moderator = Moderator;
	}
	
	public String getModuleCode() {
		return this.moduleCode;
	}

	public void setModuleCode(String moduleCode) {
		this.moduleCode = moduleCode;
	}
	
	public String getModuleName() {
		return this.moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}
	
	public void setStudents(Student Student) {
        this.Students.add(Student);
    }
    
    public List<Student> getStudents() {
        return this.Students;
    }
    
    public void removeStudents(int index) {
        Students.remove(index);
    }
    
    public void setResult (Result result) {
            resultList.add(result);
        }
        
        public List getResult () {
            return this.resultList;
        }
    
    @Override
        public String toString () {
            return this.moduleName;
        }
    
    
    
    
    
    
    
    public void moduleSerialization(Module m) {
       //gets list from file and copies it so list is kept
     try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Module.txt"));
       
        List<Module> moduleList = (List<Module>) in.readObject();
       
        for (Module module : moduleList) {
            list.add(module);
        
    }
        
    } catch (IOException ex) {
        Logger.getLogger(Module.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Module.class.getName()).log(Level.SEVERE, null, ex);
    }
     
     //adds student passed in to the list
     try {
      list.add(m);
     
     }catch (Exception e) {
          e.printStackTrace();
      }
     

    //writes the list to the file
    try {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Module.txt"));
        out.writeObject(list);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Module.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Module.class.getName()).log(Level.SEVERE, null, ex);
    }
           

    
    
            
    

     }
    
    
    //Method that gets the list of modules
    public static List getList(){
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("Module.txt"));
            List<Module> moduleList = (List<Module>) in.readObject();
            return moduleList;
        } catch (IOException ex) {
           Logger.getLogger(Module.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
           Logger.getLogger(Module.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        }
        //Method that updates the list of modules
        public static void updateList(List updateList) {
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Module.txt"));
                out.writeObject(updateList);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Module.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Module.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}