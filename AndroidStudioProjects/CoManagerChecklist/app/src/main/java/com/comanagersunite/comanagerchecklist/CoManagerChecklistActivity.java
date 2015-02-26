package com.comanagersunite.comanagerchecklist;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class CoManagerChecklistActivity extends ActionBarActivity {


    private QuestionBook mQuestionBook = new QuestionBook();
    private ColorWheel mColorWheel = new ColorWheel();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_co_manager_checklist);

        //Declare our View variables and assign them the Views from the layout file
       final TextView factLabel = (TextView) findViewById(R.id.MoreDirection);
        final Button showFactButton = (Button) findViewById(R.id.HaveYou);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);

        View.OnClickListener Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String haveYou = mQuestionBook.getQuestion();
                // Update the label with your dynamic fact
                factLabel.setText(haveYou);

                int color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);
            }
        };
        showFactButton.setOnClickListener(Listener);


        Toast.makeText(this,"CoManagersUnite.com!",Toast.LENGTH_LONG).show();




    }


}










