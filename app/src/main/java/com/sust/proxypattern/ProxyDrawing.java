package com.sust.proxypattern;

import android.view.View;

public class ProxyDrawing implements Draw{

    private Draw draw = new RealDrawing();

    @Override
    public void clear(View v) {
        draw.clear(v);
    }

    @Override
    public void draw(String user, View v) {
        if(user.equals("user")) {
            clear(v.findViewById(R.id.imageid));
            draw.draw("user",v.findViewById(R.id.textid));
        }
        else if (user.equals("admin")) {
            clear(v.findViewById(R.id.textid));
            draw.draw("admin",v.findViewById(R.id.imageid));
        }
    }
}
