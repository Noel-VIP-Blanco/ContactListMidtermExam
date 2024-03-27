package com.butas_butchnino.midtermexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ContactList : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_list)

        val button: Button = findViewById(R.id.button4)


        button.setOnClickListener {

            val intent = Intent(this, ArchivedList::class.java)
            startActivity(intent)




        }


    }


    
}