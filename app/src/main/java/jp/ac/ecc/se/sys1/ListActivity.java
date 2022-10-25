package jp.ac.ecc.se.sys1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Intent intent=new Intent(this,PreferencesActivity.class);
        String [] curryList={"ドライカレー","カツカレー","チーズカレー","スープカレー"};
        ListView listView=findViewById(R.id.currylist);
        ArrayAdapter<String> adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,curryList);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //TextView tv=(TextView) view;
                //Toast.makeText(getApplicationContext(),tv.getText(),Toast.LENGTH_SHORT).show();
                //String st=(String)adapterView.getItemAtPosition(i);
                //Toast.makeText(getApplicationContext(),st,Toast.LENGTH_SHORT).show();
                intent.putExtra("curry",i);
                startActivity(intent);
            }
        });
    }
}