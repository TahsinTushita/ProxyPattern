package com.sust.proxypattern;

import android.view.View;
import android.widget.Toast;

public class RealDrawing implements Draw{

    @Override
    public void clear(View v) {
        v.setVisibility(View.GONE);
    }

    @Override
    public void draw(String user, View v) {
        v.setVisibility(View.VISIBLE);
    }
}
