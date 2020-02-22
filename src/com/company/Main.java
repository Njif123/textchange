package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        ArrayList<String> myarray = new ArrayList<>();
        File myfile = new File("D:/lop1v2.txt");
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(myfile), "UTF8"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                myarray.add(line);
            }
        } catch (IOException e) {
            // log error
        }

        for (int i = 0; i < myarray.size() - 1; i++) {
            String s = myarray.get(i);
            removeChar(s);

        }
        try (FileWriter writer = new FileWriter("D:/lop1v3.txt", false)) {
            for (int i = 0; i < myarray.size(); i++) {
                String j = myarray.get(i);
                writer.write(j);
                // запись по символам
                writer.append('\n');

                writer.flush();
            }

        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }

    public static String removeChar(String s) {
        String r = "";
        char ch3;
        for (int j = 0; j < s.length()-1; j++) {
            if (s.charAt(j) != '`') r += s.charAt(j);
            char ch1 = s.charAt(j+1);
             ch3 = Character.toUpperCase(ch1);
        }
        return r;

    }
}