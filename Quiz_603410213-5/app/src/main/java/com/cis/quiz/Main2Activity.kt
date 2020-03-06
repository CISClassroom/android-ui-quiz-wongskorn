package com.cis.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {
     ImgeButton b1;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        b1 =  (Button)findViewById(R.id.imageButton2)
        b1.setOnClickListtener(new View.OnClickListtener()  {
            @Override
            public void onClick(View view) {
                Intent b1 = Intent(Main2Activity.this,MainActivity.class)
                startActivity(b1)
                }
        } )


    }
}
