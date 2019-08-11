package com.erik.todoapp.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.erik.todoapp.R
import com.erik.todoapp.database.DbOperationHelper
import com.erik.todoapp.util.data.User
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {

    private data class ViewHolder(
            val emailTextInputLayout: TextInputLayout,
            val emailTextInputEditText: TextInputEditText,

            val passwordTextInputLayout: TextInputLayout,
            val passwordTextInputEditText: TextInputEditText,

            val enterButton: Button,
            val createAccountButton: Button
    )

    private lateinit var viewHolder: ViewHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.viewHolder = ViewHolder(
            findViewById(R.id.text_input_layout_main_email),
            findViewById(R.id.text_input_edit_main_email),
            findViewById(R.id.text_input_layout_main_password),
            findViewById(R.id.text_input_edit_main_password),
            findViewById(R.id.button_main_enter),
            findViewById(R.id.button_main_createAccount)
        )

        this.viewHolder.createAccountButton.setOnClickListener { view ->
            startActivity(Intent(this, CreateAccountActivity::class.java))
        }

    }

}
