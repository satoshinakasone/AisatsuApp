package jp.techacademy.satoshi.nakasone.aisatsuapp;

import android.app.TimePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(this);

        mTextView = (TextView) findViewById(R.id.textView);

    }


    @Override
    public void onClick(View v) {

        showTimePickerDialog();
    }


    private void showTimePickerDialog() {
        TimePickerDialog timePickerDialog = new TimePickerDialog(this,
                new TimePickerDialog.OnTimeSetListener() {
                    @Override
                    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
                        Log.d("UI-PARTS", String.valueOf(hourOfDay) + ":" + String.valueOf(minute));

                        if (2 <= hourOfDay && hourOfDay <= 9 ) {
                            Log.d("javatest","「おはよう」");
                            mTextView.setText("おはよう");

                        } else if(10 <= hourOfDay && hourOfDay <= 17) {
                            Log.d("javatest","「こんにちは」");
                            mTextView.setText("こんにちは");

                        } else if (18 <= hourOfDay || hourOfDay <= 1){
                            Log.d("javatest","「こんばんは」");
                            mTextView.setText("こんばんは");
                        }




                    }




                },
                2, // 初期値（時間）
                0,  // 初期値（分）
                true);

        timePickerDialog.show();


    }

}






