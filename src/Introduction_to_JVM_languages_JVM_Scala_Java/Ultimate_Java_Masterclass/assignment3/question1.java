package Introduction_to_JVM_languages_JVM_Scala_Java.Ultimate_Java_Masterclass.assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class question1 {

    public static void main(String[] args) {
    try

    {
        readFile("test.txt");
    }
    catch(IOException e)
    {
        System.out.println(e);
    }

    try{
        throw new IOException("Manual");
    }
    catch (IOException e)
    {
        System.out.println(e);
    }

}
    public static void readFile(String file) throws IOException {
        BufferedReader br = null;
        try {
             br = new BufferedReader(new FileReader(file));
             String line;
                while ((line = br.readLine()) != null)
                 {
                System.out.println(line);
                }
              }
            catch (IOException e)
            {
                System.out.println(e);
                throw e;
            }
        finally {
            try{
                if (br != null){
                    br.close();}
            }
            catch (IOException e) {
                System.out.println(e);
            }
            System.out.println("Finally executed");
        }
    }
}
