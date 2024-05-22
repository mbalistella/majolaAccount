/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package majolaaccount;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class MajolaAccount {

    
    public static void main(String[] args) {
        //Once the user has successfully logged in the following message will be displayed
        JOptionPane.showMessageDialog(null, "Welcome to easy Kanban");
        
        // user input is required for the program to run accordingly
         int menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option then press ok :\n1) Add tasks\n" + "2) This feature is still in development \n" + "3) Quit"));
  
         // Create the Registration object = instantiation/instatiate
         task objtask = new task();
         
         //methods to execute the whole program
         int taskDuration = 0;
         
         
         while (menu!=3){
         if (menu ==1){
             
           int numberOfTasks = Integer.parseInt(JOptionPane.showInputDialog(null, "How many tasks would you like to add?"));
            
           for (int i =0; i < numberOfTasks; ++i){
               objtask.settaskName(JOptionPane.showInputDialog(null, "Please enter the name of the task."));
               
               objtask.settaskDescription(JOptionPane.showInputDialog(null, "Please enter the description of the task."));
               objtask.checkTaskDescription();
               objtask.setdeveloperDetails(JOptionPane.showInputDialog(null, "Please enter your first and last name."));
               taskDuration = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter task duration (in hours)")) ;
               objtask.returnTotalHours();
               int option = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select one task status :\n1) To do \n" + "2) Done \n" + "3) Doing"));
               switch (option){
                   case 1:{
                       final String taskStatus = "To do";
                       objtask.settaskStatus(taskStatus);
                       break;
                   }
                   case 2:{
                    final String taskStatus = "Done";
                       objtask.settaskStatus(taskStatus);
                       break;
                   }
                   case 3:{
                    final String taskStatus = "Doing";
                       objtask.settaskStatus(taskStatus);
                       break;  
               }
                   default: {
                    JOptionPane.showMessageDialog(null, "Incorrect input");   
                   }   
               }
                 
                 objtask.settaskDuration(taskDuration);
                 objtask.createTaskID();
               JOptionPane.showMessageDialog(null, objtask.printTaskDetails());
               int count = 0;
               count++; 
              

           }
           
           objtask.display();
           
           }
           
         else if(menu ==2){
           JOptionPane.showMessageDialog(null, "Coming soon");   
             
         }
         else if (menu ==3){
         System.exit(0);
         }
          menu = Integer.parseInt(JOptionPane.showInputDialog(null, "Please select an option then press ok :\n1) Add tasks\n" + "2) This feature is still in development \n" + "3) Quit"));
         }
    }
    
}
