package com.example.vinu.fire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
public Button save;
    public EditText e1;
    public EditText e2;
    public EditText e3;
    Integer i=1;
   private FirebaseDatabase mfirebase=FirebaseDatabase.getInstance();
    private DatabaseReference mdatabase=mfirebase.getReference();
    private  DatabaseReference m1;//=mdatabase.child("new");
    private DatabaseReference m11;//=m1.child("name");
    private  DatabaseReference m12;//=m1.child("class");




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        e3=(EditText)findViewById(R.id.editText3);
        save=(Button)findViewById(R.id.button2);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=e1.getText().toString();
                String s2=e2.getText().toString();
                String s3=e3.getText().toString();

                m1=mdatabase.child("new");
                m11=m1.child("name");
                m12=m1.child("class");
                m1.setValue("best student");
                m11.setValue(s1);
                m12.setValue(s2);



            }
        });

    }
}
