
package GUI;


import java.io.Serializable;
import java.util.UUID;
/**
 *
 * @author Chris Hartless
 */
public class Result implements Serializable{

    private String date;
    private int grade;
    private String module;
    private String feedback;
    private String ID;
    //Result Constructor

    /**
     *
     * @param date
     * @param grade
     * @param module
     * @param feedback
     */
    public Result(String date,int grade, String module, String feedback) {
        this.date = date;
        this.grade = grade;
        this.module = module;
        this.feedback = feedback;
        setID();
    }
            
    //Getters and Setters
    public void setDate(String date) {
		this.date = date;
    }
        
    public String getDate() {
        return this.date;
    }  
    
    public void seGrade(int grade) {
		this.grade = grade;
    }
        
    public int getGrade() {
        return this.grade;
    }
    
    public void setmodule(String module) {
		this.module = module;
    }
        
    public String getmodule() {
        return this.module;
    } 
    
    public void setFeedback(String feedback) {
		this.feedback = feedback;
    }
        
    public String getFeedback() {
        return this.feedback;
    }
       
    public String getID() {
		return this.ID;
	}
	
	public void setID() {
		UUID idOne = UUID.randomUUID();
	    ID = idOne.toString();
	}
}
