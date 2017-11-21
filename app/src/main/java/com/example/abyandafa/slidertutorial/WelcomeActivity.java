package com.example.abyandafa.slidertutorial;

import android.graphics.Color;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;

public class WelcomeActivity extends Fragment{

    private Button yes;
    private Button no;
    public int urutan;

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if(urutan==1)
        {
            yes.setText("haha");
        }
        else if(urutan==2)
        {
            yes.setText("hehe");
        }
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "Ya", Toast.LENGTH_SHORT).show();
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "No", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_welcome, container, false);

        yes = (Button) view.findViewById(R.id.buttonIya);
        no = (Button) view.findViewById(R.id.buttonTidak);
        view.setBackgroundColor(Color.parseColor("#2196F3"));
        return view;
    }





}
