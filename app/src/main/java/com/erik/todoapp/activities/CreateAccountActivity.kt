package com.erik.todoapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.erik.todoapp.R

class CreateAccountActivity : AppCompatActivity() {

    private data class ViewHolder(
            val completeNameEditText: EditText,
            val emailEditText: EditText,
            val passwordEditText: EditText,
            val confirmPasswordEditText: EditText,

            val createButton: Button
    )

    private lateinit var viewHolder:ViewHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        this.viewHolder = ViewHolder(
                findViewById(R.id.edit_createaccount_completename),
                findViewById(R.id.edit_createaccount_email),
                findViewById(R.id.edit_createaccount_password),
                findViewById(R.id.edit_createaccount_confirmpassword),
                findViewById(R.id.button_createaccount_create)
        )
    }
}
