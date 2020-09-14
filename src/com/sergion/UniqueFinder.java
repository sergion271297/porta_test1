package com.sergion;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class UniqueFinder {

    public ArrayList<String> uniqueFindFromFile(File file1, File file2) throws IOException {
        ArrayList<String> userList1 = fileToList(file1);
        ArrayList<String> userList2 = fileToList(file2);
        System.out.println("Список пользователей которые встречаются в "+file1.getName()+" и не встречаются в "+file2.getName()+":");
        return uniqueFindFromList(userList1, userList2);
    }

    public ArrayList<String> uniqueFindFromList(ArrayList<String> userList1, ArrayList<String> userList2){
        ArrayList<String> result = new ArrayList<>();
        for (String name : userList1) {
            if (!userList2.contains(name)) {
                result.add(name);
                //System.out.println(name);
            }
        }
        return result;
    }

    public ArrayList<String> fileToList(File file) throws IOException {
        System.out.println("Reading from file: " + file.getName() + " ...");
        ArrayList<String> userList = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        String tempLine;
        while(true) {
            tempLine = reader.readLine(); {
                if (tempLine == null) break;
            }
            if (tempLine.startsWith("\"")) {
                tempLine = tempLine.substring(1);
            }
            if (tempLine.endsWith("\"")) {
                tempLine = tempLine.substring(0, tempLine.length() - 1);
            }
            String[] tempLineParts = tempLine.split(", ");
            for (String tempLinePart : tempLineParts) {
                if (tempLinePart.contains("user: ")) {
                    userList.add(tempLinePart.substring(6)); //del "user: "
                }
            }
        }
        System.out.println("Users from "+file.getName()+" loaded.");
        reader.close();
        return userList;
    }
}
