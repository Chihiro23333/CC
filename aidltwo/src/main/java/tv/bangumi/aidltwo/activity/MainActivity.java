package tv.bangumi.aidltwo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import tv.bangumi.aidltwo.R;


/**
 * @author 朱峰 2019/8/30
 */
public class MainActivity extends AppCompatActivity {

    private Button bt_one;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

        bt_one = (Button) findViewById(R.id.bt_two);
    }
}
