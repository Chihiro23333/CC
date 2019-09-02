package tv.bangumi.ffmpeg;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.AppCompatTextView;
import tv.bangumi.ffmpeg.R;

/**
 * @author 朱峰 2019/8/6
 */
public class MainActivity extends AppCompatActivity {

    private AppCompatTextView text;

    static {
        System.loadLibrary("native-lib");
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.act_main);

        text = findViewById(R.id.text);

        text.setText(helloNDK("你好 C++ \n"));
    }

    public native String helloNDK(String msg);

}
