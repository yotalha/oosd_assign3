import java.io.File;

public class FileHandling {
    public static void main(String[] args){
        File file = new File("testFile.txt");

        try{
            boolean value = file.createNewFile();
            if(value){
                System.out.println("New file has been created");
            }
            else{
                System.out.println("File not created");
            }
        }catch(Exception e){
            System.out.println("Caught an exception: " + e.getStackTrace());
        }
    }
}
