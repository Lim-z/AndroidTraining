package jp.ac.ecc.se.sys1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.metrics.Event;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class List2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list2);
        ArrayList<String> dataList=new ArrayList<>();
        EditText input=findViewById(R.id.editTextTextPersonName5);
        Button button2=findViewById(R.id.button2);
        ListView list=findViewById(R.id.list1);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,dataList);

        list.setAdapter(adapter);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(!input.getText().toString().equals("")) {
                    dataList.add(input.getText().toString());
                    list.setAdapter(adapter);
                    input.setText("");
                }
            }
        });
        Intent intentSub=new Intent(this,SubActivity.class);
        Intent intentEvent=new Intent(this, EventActivity.class);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i%2==0){
                    startActivity(intentEvent);
                }else{
                    startActivity(intentSub);
                }
            }
        });
    }
}