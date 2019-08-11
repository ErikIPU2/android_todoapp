package com.erik.todoapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.erik.todoapp.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CreateAccountActivity : AppCompatActivity() {

    private data class ViewHolder(
            val completeNameTextInputLayout: TextInputLayout,
            val emailTextInputLayout: TextInputLayout,
            val passwordTextInputLayout: TextInputLayout,
            val confirmPasswordTextInputLayout: TextInputLayout,

            val completeNameTextInputEditText: TextInputEditText,
            val emailTextInputEditText: TextInputEditText,
            val passwordTextInputEditText: TextInputEditText,
            val confirmPasswordTextInputEditText: TextInputEditText,

            val createButton: Button
    )

    private lateinit var viewHolder:ViewHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account)

        this.viewHolder = ViewHolder(
            findViewById(R.id.text_input_layout_create_account_complete_name),
            findViewById(R.id.text_input_layout_create_account_email),
            findViewById(R.id.text_input_layout_create_account_password),
            findViewById(R.id.text_input_layout_create_account_confirm_password),

            findViewById(R.id.text_input_edit_create_account_complete_name),
            findViewById(R.id.text_input_edit_create_account_email),
            findViewById(R.id.text_input_edit_create_account_password),
            findViewById(R.id.text_input_edit_create_account_confirm_password),

            findViewById(R.id.button_create_account_create)
        )
    }
}
