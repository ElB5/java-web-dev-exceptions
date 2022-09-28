package org.launchcode.exercises;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // Test out your Divide() function!

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
    }

    public static void Divide(int x, int y) {
        // Write code here!
        int c = x/y;
        System.out.println("Division has been successfully done");
        System.out.println("Value after division: "+c);

        if (y == 0) {
            try
            {
                throw new ArithmeticException ("Cannot divide by 0.");
            } catch (ArithmeticException z){
                z.printStackTrace();
            }
        }
//ArithmeticException ex=new ArithmeticException();
//ex.division(10,0);
    }

    public static int CheckFileExtension(String fileName)
    {
        // Write code here! CheckFileExtension() should return an integer representing the number of points a
        // student receives for properly submitting a file in Java. If a student’s submitted file ends in .java,
        // they get 1 point. If a student’s submitted file doesn’t end in .java, they get 0 points. If the file
        // submitted is null or an empty string, an exception should be thrown and you should give the student
        // -1 points.


    }

}
