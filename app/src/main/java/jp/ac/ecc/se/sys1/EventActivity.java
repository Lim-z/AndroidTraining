package jp.ac.ecc.se.sys1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class EventActivity extends AppCompatActivity  implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        Intent intent=getIntent();
        int age=intent.getIntExtra("age",25);
        Toast.makeText(this,"年齢"+age,Toast.LENGTH_SHORT).show();
        TextView profile=findViewById(R.id.Profile);
        profile.setText("プロフィール");
        EditText editText1=findViewById(R.id.editTextTextPersonName2);
        EditText editText2=findViewById(R.id.editTextTextPersonName3);
        Button clear1=findViewById(R.id.clearButton2);
        Button clear2=findViewById(R.id.button3);
        TextView ages=findViewById(R.id.textView6);
        TextView gender=findViewById(R.id.textView7);
        CheckBox check1=findViewById(R.id.checkBox);
        CheckBox check2=findViewById(R.id.checkBox2);
        CheckBox check3=findViewById(R.id.checkBox3);
        RadioButton radio1=findViewById(R.id.radioButton4);
        RadioButton radio2=findViewById(R.id.radioButton5);
        Button confirm=findViewById(R.id.button4);
        clear1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText1.setText("");
            }
        });
        clear2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText2.setText("");
                setTitle("練習アプリ");
            }
        });
        confirm.setOnClickListener(this);
        confirm.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                if(radio1.isChecked()==true){
                    Toast.makeText(EventActivity.this, R.string.Man, Toast.LENGTH_SHORT).show();
                }else if(radio2.isChecked()==true){
                    Toast.makeText(EventActivity.this, R.string.Woman, Toast.LENGTH_SHORT).show();
                }
                finish();
                return false;
            }
        });
        clear2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                setTitle(editText2.getText());
                return false;
            }
        });

    }

    @Override
    public void onClick(View view) {
        EditText editText1=findViewById(R.id.editTextTextPersonName2);
        Toast.makeText(this,editText1.getText(),Toast.LENGTH_SHORT).show();
    }
}