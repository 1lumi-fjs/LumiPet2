package com.lumi.pet;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView text = new TextView(this);

        text.setText(
                "🎀 露米桌宠\n\n" +
                "你好呀～\n\n" +
                "第一阶段编译测试成功！"
        );

        text.setTextSize(24);
        text.setTextColor(Color.rgb(100, 80, 130));
        text.setGravity(Gravity.CENTER);

        setContentView(text);
    }
}
