package com.example.buttonhandling;

import android.graphics.Color;
import android.view.View;

public class onClickTesting implements View.OnClickListener {
    @Override
    public void onClick(View view) {
        view.setBackgroundColor(Color.YELLOW);

    }
}
