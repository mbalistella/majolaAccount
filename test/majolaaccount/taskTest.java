/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package majolaaccount;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class taskTest {
    
    public taskTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    
    @Test
    public void testCheckTaskDescriptionTASK1() {
        System.out.println("gettaskName");
        task instance = new task();
        
        final String actual = "Create login to authenticate users";
        final String expected = "Task successfully captured";
        
        assertEquals(expected, instance.checkTaskDescription());
       
    }

    @Test
    public void  testCheckTaskDescriptionTASK2() {
        System.out.println("gettaskName");
        task instance = new task();
        
        final String actual = "Create Add Task featuer to add task users.......";
        final String expected = "Task successfully captured";
        
        assertEquals(expected, instance.checkTaskDescription());
    }

   
    @Test
    public void testCreateTaskIDTASK1() {
        task instance = new task();
        final String expected = "LO:0:BYN";
        assertEquals(expected, instance.createTaskID());
        
    }

    /**
     * Test of getdeveloperDetails method, of class task.
     */
    @Test
    public void testCreateTaskIDTASK2() {
        task instance = new task();
        final String expected = "AD:1:IKE";
        assertEquals(expected, instance.createTaskID());
    }
     @Test
    public void testReturnTotalHours() {
     task instance = new task();
     
     final int expected = 10;
     instance.returnTotalHours();
     
    }
   
    @Test
    public void testGettaskDuration() {
        
    }

  
    @Test
    public void testGettaskID() {
       
    }

   
    @Test
    public void testGetcount() {
       
    }

   
    @Test
    public void testGettaskStatus() {
       
    }

    
    @Test
    public void testGetMenu() {
        
    }

   
    @Test
    public void testGettotal() {
       
    }

   
    @Test
    public void testSettaskName() {
        
    }

   
    @Test
    public void testSettaskNumber() {
       
    }

   
    @Test
    public void testSettaskDescription() {
        
    }

   
    @Test
    public void testSetdeveloperDetails() {
       
    }

    
    @Test
    public void testSettaskDuration() {
        
    }

   
    @Test
    public void testSettaskID() {
        
    }

    
    @Test
    public void testSettaskStatus() {
       
    }

   
    @Test
    public void testSetMenu() {
        
    }

   
    @Test
    public void testSettotal() {
       
    }

   
    @Test
    public void testSetcount() {
        
    }

    
   
    @Test
    public void testPrintTaskDetails() {
       
    }

    
   
   
    @Test
    public void testDisplay() {
        
    }
    
}
