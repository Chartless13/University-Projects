
package Students;
import GUI.Person;
import GUI.Result;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Chris Hartless
 */
public class Student extends Person implements Serializable{
    
private String Course;
    

public List<Student> list = new ArrayList<Student>();
private List<Result> resultList = new ArrayList<Result>();

    //Student Constructor
    public Student(String fName, String lName, String DOB, String address, String course) {
        super(fName, lName, DOB,address);
        this.Course = course;
    }
        //Getters and setters
        public void setCourse(String Course) {
		this.Course = Course;
	}
        
        public String getCourse() {
		return this.Course;
	}  
        
        public void setResult (Result result) {
            resultList.add(result);
        }
        
        public List getResult () {
            return this.resultList;
        }
        
        
        
     
        public void studentSerialization(Student s) {
       //gets list from file and copies it so list is kept
     try {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.txt"));
       
        List<Student> studentList = (List<Student>) in.readObject();
       
        for (Student student : studentList) {
        System.out.println(student.getFirstName());
            list.add(student);
        
    }
        
    } catch (IOException ex) {
        Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
    }
     
     //adds student passed in to the list
     try {
      list.add(s);
     
     }catch (Exception e) {
          e.printStackTrace();
      }
     

    //writes the list to the file
    try {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"));
        out.writeObject(list);
    } catch (FileNotFoundException ex) {
        Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
    }

}
        //Method to get the list of Students
        public static List getList(){
            try {
                ObjectInputStream in = new ObjectInputStream(new FileInputStream("test.txt"));
                List<Student> studentList = (List<Student>) in.readObject();
                return studentList;
            } catch (IOException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
            return null;
            }
        //Method that updates the list of Students
        public static void updateList(List updateList) {
            try {
                ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("test.txt"));
                out.writeObject(updateList);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
}

