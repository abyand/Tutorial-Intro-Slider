package com.example.abyandafa.slidertutorial;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntro2;
import com.github.paolorotolo.appintro.AppIntroFragment;

/**
 * Created by Abyan Dafa on 19/11/2017.
 */

public class Slider extends AppIntro2{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setFlowAnimation();

        WelcomeActivity welcomeActivity = new WelcomeActivity();
        welcomeActivity.urutan=1;
        WelcomeActivity welcomeActivity1 = new WelcomeActivity();
        welcomeActivity1.urutan=2;
        addSlide(welcomeActivity);
        //welcomeActivity.urutan=2;
        addSlide(AppIntroFragment.newInstance("Dafa", "Bahahah", R.drawable.ic_haha, Color.parseColor("#2196F3")));
        addSlide(AppIntroFragment.newInstance("Dafa", "Bahahah", R.drawable.ic_haha, Color.parseColor("#454c56")));
        addSlide(welcomeActivity1);


        showSkipButton(false);
        setProgressButtonEnabled(true);

    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        Toast.makeText(this, "hehe", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDonePressed() {
        super.onDonePressed();
        Toast.makeText(this, "selesai", Toast.LENGTH_SHORT).show();
        finish();
    }

    @Override
    public void onSlideChanged() {
        super.onSlideChanged();
        Log.d("ganti fragment", "onSlideChanged: ");
    }

}
