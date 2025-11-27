package com.zybooks.pigeonnamer;

import android.content.res.Resources;
import android.content.Context;

import java.util.Random;

public class Namer {
    private static String[] names;
    private final Random random = new Random();

    public Namer() {
    }

    public String newName() {

        int n = random.nextInt(1178);

        return names[n];
    }

    public void getArray(Context context) {
        Resources res = context.getResources();
        names = res.getStringArray(R.array.names);
    }

}
