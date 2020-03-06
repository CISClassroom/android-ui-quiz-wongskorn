package com.cis.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.ImageButton
import android.widget.RelativeLayout
import kotlinx.android.synthetic.*

class MainActivity : AppCompatActivity() {
       ImageButton p1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        p1 = (ImageButton)findViewById(R.id.imageButton)
        p1.setOnClickListtener(new View.OnClickListenter(){
            @Override
            public void onClick(View view){
                Intent p1 = new  Intent(MainActivity.this,Main2Activity.class)
                        startActivity(p1)
            }

        })
        







    }



}
