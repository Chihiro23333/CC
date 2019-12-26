package tv.bgm.demo_diyview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import tv.bgm.demo_diyview.chapterone.ChaperOneActivity;
import tv.bgm.demo_diyview.chaptertwo.AnimActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);

    }

    public void toChapterOne(View view){
        Intent i = new Intent(this, ChaperOneActivity.class);
        startActivity(i);
    }

    public void toChapterTwo(View view){
        Intent i = new Intent(this, AnimActivity.class);
        startActivity(i);
    }
}
