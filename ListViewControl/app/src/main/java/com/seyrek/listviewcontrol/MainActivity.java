package com.seyrek.listviewcontrol;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    //defining arraylist
    ArrayList arrayList = new ArrayList();
    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        //adding item to arraylist
       /* arrayList.add("İzmir");
        arrayList.add("Konya");
        arrayList.add("Sinop");
        arrayList.add("Balıkesir");*/

        //adding alphabet
        for (int i = 65; i <= 90; i++) {
            //change int to ascii
            //arrayList.add(Character.toString((char)i));
            arrayList.add((char) i);
        }


        //defining adapter
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayList);
        listView.setAdapter(adapter);

        //click item on listview
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //show the message of the item clicked
                Toast.makeText(MainActivity.this, "id= " + id +
                                "\nposition= " + position +
                                "\nitem= " + arrayList.get(position)
                        , Toast.LENGTH_LONG).show();
            }
        });
    }
}
