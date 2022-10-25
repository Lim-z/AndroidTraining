package jp.ac.ecc.se.sys1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SubActivity extends AppCompatActivity  implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_const);
        setTitle("練習アプリ");


        TextView nameLabel=findViewById(R.id.nameLabel);
        nameLabel.setText("Name");

        EditText nameText=findViewById(R.id.nameText);
        Button clearButton=findViewById(R.id.clearButton2);
        Button confirmButton=findViewById(R.id.confirmButton);
        Button sendButton=findViewById(R.id.sendButton);

        sendButton.setOnClickListener(this);
        confirmButton.setOnClickListener(this);
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nameText.setText("");
            }
        });
    }

    @Override
    public void onClick(View view) {
        //setTitle("Button Clicked");
        Intent intent=new Intent(this,EventActivity.class);

        switch(view.getId()){
            case R.id.sendButton:
                Toast.makeText(this,"送信クリック",Toast.LENGTH_SHORT).show();
                intent.putExtra("age",19);
                startActivity(intent);
                break;

            case  R.id.confirmButton:
                Toast.makeText(this,"確認クリック",Toast.LENGTH_SHORT).show();
                break;

        }
    }


}