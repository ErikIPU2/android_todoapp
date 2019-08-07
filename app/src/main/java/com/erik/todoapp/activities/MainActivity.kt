package com.erik.todoapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.erik.todoapp.R

class MainActivity : AppCompatActivity() {

    private data class ViewHolder(
            val emailEditText: EditText,
            val passwordEditText: EditText,

            val enterButton: Button,
            val createAccountButton: Button
    )

    private lateinit var viewHolder: ViewHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.viewHolder = ViewHolder(
                findViewById(R.id.edit_main_email),
                findViewById(R.id.edit_main_password),
                findViewById(R.id.button_main_enter),
                findViewById(R.id.button_main_createAccount)
        )

        this.viewHolder.createAccountButton.setOnClickListener { view ->
            startActivity(Intent(this, CreateAccountActivity::class.java))
        }
    }

}
