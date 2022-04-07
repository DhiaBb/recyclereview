package com.example.recyclereview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView rv;
    String[]titre;
    String[]soust;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv=findViewById(R.id.RecycleV);
        titre=getResources().getStringArray(R.array.tit);
        soust=getResources().getStringArray(R.array.stit);
        ListeAdapter ad;

        Integer[]img={R.drawable.home,R.drawable.search,R.drawable.home,R.drawable.search,R.drawable.home,R.drawable.search,R.drawable.home,R.drawable.search};
        ad= new ListeAdapter(MainActivity.this,titre,soust,img);
        rv.setLayoutManager(new LinearLayoutManager(this)) ;
        rv.setAdapter(ad);


    }
}