package com.datamhs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    String[] items={"1).\t72140020\t Brayen Chanzezar Saroinsong","2).\t72140048\t Arnold Stanley Rivaldy Tato"
            ,"3).\t72150019\t Verina Kristanti Wiyono","4).\t72150043\t Yubelince Naomi Wakum","5).\t72150066\t Hendry Masiku"
            ,"6).\t72160033\t Baskoro Adi Wicaksono","7).\t72170092\t Yos Rafel Kristanto","8).\t72170106\t Alfadeo Melody Jeremy Bulin"
            ,"9).\t72170110\t Yashinta Novita Dewi","10).\t72170112\t Yalina Hosea","11).\t72170125\t Adrian Paskalis"
            ,"12).\t72170126\t Desta Siwi P","13).\t72170131\t Cindy Claudya","14).\t72170146\t Angkie Octovaldo Elias Wangkay"
            ,"15).\t72170148\t Christian Dorra","16).\t72170154\t Tita Marita Simangunsong","17).\t72170155\t Angga Dwi Kaharap"
            ,"18).\t72170158\t Fransiska Ayu Gloria","19).\t72170160\t Mika Havennia Sirait","20).\t72170166\t Marni Eva Kristina Saragih"
            ,"21).\t72170168\t Aristyo Rahadian Agung Nugroho","22).\t72170170\t Laurentia Yulia Cristi"
            ,"23).\t72170172\t Putu Abdi Setiawan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View.OnClickListener tambahButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ActivityTambah.class);
                startActivity(intent);
            }
        };
        Button tambahBtn = (Button)findViewById(R.id.btnAdd);
        tambahBtn.setOnClickListener(tambahButtonListener);

        View.OnClickListener updateButtonListener = new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,UpdateActivity.class);
                startActivity(intent);
            }
        };
        Button updateBtn = (Button)findViewById(R.id.btnUpdate);
        updateBtn.setOnClickListener(updateButtonListener);

        ListView lv = (ListView)findViewById(R.id.listView);
        lv.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,items));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,"Anda memilih " + items[position], Toast.LENGTH_SHORT).show();
            }
        });


    }
}
