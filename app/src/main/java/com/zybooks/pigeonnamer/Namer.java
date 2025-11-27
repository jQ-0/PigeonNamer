package com.zybooks.pigeonnamer;

import android.content.res.Resources;
import android.content.Context;

import java.util.Random;
public class Namer {
    private static String[] names;

    public Namer() {}

    public String newName() {
        Random random = new Random();

        int n = random.nextInt(1178);

        return names[n];
    }

    public void getArray(Context context) {
        Resources res = context.getResources();
        names = res.getStringArray(R.array.names);
    }

}
