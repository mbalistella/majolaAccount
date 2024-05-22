/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package majolaaccount;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
class task {
     //Create attributes/instance variables
    public String taskName;
    public int taskNumber;
    public String taskDescription;
    public String developerDetails;
    public int taskDuration;
    public String taskID;
    public int count;
    public String taskStatus;
    public final String[] numericMenu;
    public String menu = "";
    public int choice;
    public int total;
    
    //Create the constructors - to set the default values to the attributes
    public task(){
    this.taskName = "";
    this.taskNumber = 0;
    this.taskDescription = "";
    this.developerDetails = "";
    this.taskDuration = 0;
    this.total = 0;
    this.taskID ="";
    this.count = 0;
    this.taskStatus = "";
    this.numericMenu = new String[]{"Add tasks", "This feature is still in development(COMING SOON)", "Quit"};
    
    }
     // Create the getters/accessor methods
    public String gettaskName(){
    return taskName;
    }
    public int gettaskNumber(){
    return taskNumber;
    }
    public String gettaskDescription(){
    return taskDescription;
    }
    public String getdeveloperDetails (){
    return developerDetails;
    }
    public int gettaskDuration(){
    return taskDuration;
    }
    public String gettaskID(){
    return taskID;
    }
    public int getcount(){
    return count;    
    }    
    public String gettaskStatus(){
    return taskStatus;
    }
    public String getMenu(){
        return menu;
    }
    public int gettotal(){
        return total;
    }
     //create setters/mutator methods
     public void  settaskName(String taskName){
    this.taskName = taskName;
    }
    public void settaskNumber(int taskNumber){
    this.taskNumber = taskNumber;
    }
    public void settaskDescription(String taskDescription){
    this.taskDescription = taskDescription;
    }
    public void setdeveloperDetails (String developerDetails){
    this.developerDetails = developerDetails;
    }
    public void settaskDuration(int taskDuration){
    this.taskDuration = taskDuration;
    }
    public void settaskID(String taskID){
    this.taskID = taskID;
    }
    public void settaskStatus(String taskStatus){
    this.taskStatus = taskStatus;
    }
    public void setMenu(String menu){
        this.menu = menu;
    }
    public void settotal(int total){
        this.total = total;
    }
    public void setcount(int count){
        this.count = count;
    }
    //This method is for checking the task description
   public boolean checkTaskDescription() {
    for (int i = 0; i<2; i++)
          {
          if (taskDescription.length()<=50){
          JOptionPane.showMessageDialog(null, "Task successfully captured");
          break;
   }
   else{JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters ");
                                                         
   }
          
}
        return false;
   }
   
   //This method creates the task ID
    public String createTaskID (){
  taskID = (taskName.substring(0, 2) + ":" + count + ":" + developerDetails.substring(developerDetails.length() - 3));
  taskID = taskID.toUpperCase();
 return taskID;
 }
    
    //This method prints the task details
    public String printTaskDetails(){
    String output = "Task Details:   "+ "Task status:  "+ taskStatus + " /n "+ "Developer Details:  "+ developerDetails +" /n "+"Task Number:   "+count + " /n " +"Task Name:   "+ taskName+" /n "+ "Task Description: " + taskDescription+"/n"+ "Task ID:  "+taskID + "/n" + "Task Duration: " + taskDuration;
            return output;
            }
    
    
    //This method returns the total hours combined for the total tasks
    public int returnTotalHours() {
         int count = 0;
         int numberOfTasks = 0;
        if (count < numberOfTasks){
        this.total += taskDuration;
        }
        
        return total;
}
 public void display(){
 JOptionPane.showMessageDialog(null, "Total hours for all tasks: " + this.total);
 } 
}

    

