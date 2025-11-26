package com.zybooks.pigeonnamer;

import java.io.IOException;
import java.util.Random;
import java.util.Vector;
import java.io.BufferedReader;
import java.io.FileReader;

import android.annotation.SuppressLint;

public class Namer {

    private static Vector<String> names;

    public Namer() {
        try {
            @SuppressLint("SdCardPath") String FILE = "/data/data/com.zybooks.pigeonnamer/files/sorted_names.txt";
            BufferedReader reader = new BufferedReader(new FileReader(FILE));
            String line;
            Vector<String> temp = new Vector<>();

            while ((line = reader.readLine()) != null) {
                temp.addElement(line);
            }
            reader.close();
            names = temp;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public String newName() {
        Random random = new Random();

        int n = random.nextInt(1178);

        return names.get(n);
    }

}
