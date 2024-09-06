package LearningPath4.Course3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p1task1 {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\ashwi\\IdeaProjects\\Course1-Assignment1\\src\\test.txt";
        String searchStr = "Hello";
                searching(filepath,searchStr);
    }

    public static void searching(String filepath, String searchStr) {
        try(BufferedReader br = new BufferedReader(new FileReader(filepath))) {
            String line;
            int lineno = 0;
            int totalocc = 0;

            while((line = br.readLine())!= null)
            {
                int countinline = countlinefn(line, searchStr);
                if(countinline > 0)
                {
                    totalocc += countinline;
                    System.out.println("Found at Line" + lineno);
                }
            }
            System.out.println("Total occurences \t" + totalocc);
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }

    public static int countlinefn(String line, String searchStr) {
        int count = 0;
        int index = 0;
        while ((index = line.indexOf(searchStr, index))!= -1) {
            count++;
            index += searchStr.length();
        }
        return count;
    }
}
