import java.io.File;

import java.io.IOException;
import java.io.FileWriter; 
import java.io.FileNotFoundException;   
// Importing the Scanner class for reading text files  
import java.util.Scanner;   

public class POCFileHandling {
    public static void main(String args[]){
        // createFile();
        // getFIleInfo();
        writeToFile();
        readFromAFile();
    }

    public static void createFile() {
        try {
            File f0 = new  File("C:/Users/talha.arshad/code/java_learning/oosd/assignments/assignment3/learning.txt");
            if(f0.createNewFile()){
                System.out.println("File " + f0.getName() + " is created successfully");
            } else {
                System.out.println("File already exists in the directory.");
            }
        } catch (IOException e) {
            System.out.println("An unexpected error has occurred.");
            e.printStackTrace();
        }
    }

    public static void getFIleInfo(){
        File f0 = new File("C:/Users/talha.arshad/code/java_learning/oosd/assignments/assignment3/learning.txt");  
        if (f0.exists()) {  
            // Getting file name  
            System.out.println("The name of the file is: " + f0.getName());  
   
            // Getting path of the file   
            System.out.println("The absolute path of the file is: " + f0.getAbsolutePath());     
   
            // Checking whether the file is writable or not  
            System.out.println("Is file writeable?: " + f0.canWrite());    
   
            // Checking whether the file is readable or not  
            System.out.println("Is file readable " + f0.canRead());    
   
            // Getting the length of the file in bytes  
            System.out.println("The size of the file in bytes is: " + f0.length());    
        } else {  
            System.out.println("The file does not exist.");  
        }  
    }

    public static void writeToFile(){
        try {  
            FileWriter fwrite = new FileWriter("C:/Users/talha.arshad/code/java_learning/oosd/assignments/assignment3/learning.txt");  
            // writing the content into the FileOperationExample.txt file  
            fwrite.write("I am writing this into my learning file\n");
            fwrite.write("Checking smething");   

       
            // Closing the stream  
            fwrite.close();   
            System.out.println("Content is successfully written to the file.");  
        } catch (IOException e) {  
            System.out.println("Unexpected error occurred");  
            e.printStackTrace();  
        }
    }

    public static void readFromAFile(){
        try {
            File f1 = new File("C:/Users/talha.arshad/code/java_learning/oosd/assignments/assignment3/learning.txt");
            Scanner dataReader = new Scanner(f1);
            while(dataReader.hasNextLine()){
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            dataReader.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Unexpected error occurred!");
            exception.printStackTrace();
        }
    }
}
