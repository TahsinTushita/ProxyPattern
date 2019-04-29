package com.sust.proxypattern;

import android.view.View;

public interface Draw {
    void clear(View v);
    void draw(String user, View v);
}
