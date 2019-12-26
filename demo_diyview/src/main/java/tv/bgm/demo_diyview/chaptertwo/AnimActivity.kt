package tv.bgm.demo_diyview.chaptertwo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.animation.AnimationUtils
import tv.bgm.demo_diyview.R

class AnimActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_chapter_two)
    }

    fun startAnim(v:View){
        val animation = AnimationUtils.loadAnimation(this,R.anim.setanim);
        findViewById(R.id.tv).startAnimation(animation);
    }

}