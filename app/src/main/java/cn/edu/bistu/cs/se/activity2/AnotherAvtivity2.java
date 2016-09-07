package cn.edu.bistu.cs.se.activity2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class AnotherAvtivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_another_avtivity2);



        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        Integer age=intent.getIntExtra("age", 20);
        Toast.makeText(this,name+age, Toast.LENGTH_LONG).show();

    }


}
