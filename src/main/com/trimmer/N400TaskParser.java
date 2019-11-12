package main.com.trimmer;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class N400TaskParser {

    public ArrayList<String> parse(String filePath) throws IOException {

        ArrayList<String> lines = getTasksAsArrayList(filePath);
        ArrayList<String> names = new ArrayList<String>();
        for (String line : lines) {
            String name = parseName(line);
            names.add(name);
            System.out.println(name);
        }
        return names;
    }

     public ArrayList getTasksAsArrayList(String filePath) throws IOException {

         ArrayList<String> list = new ArrayList<String>();
         BufferedReader br = new BufferedReader(new FileReader(filePath));
         String thisLine;
         while ((thisLine = br.readLine()) != null) { // while loop begins here
             System.out.println(thisLine);
             list.add(thisLine);
         } // end while

//        Scanner s = new Scanner(new File(filePath));
//        ArrayList<String> list = new ArrayList<String>();
//        while (s.hasNext()){
//            String item = s.next();
//            list.add(item);
//            System.out.println(item);
//        }
//        s.close();

        return list;
    }

     public String parseName(String line) {

        String[] tokens = line.split("\\(");

        return tokens[0].trim().replace("_", " ");
    }
}
