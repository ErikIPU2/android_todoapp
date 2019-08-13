package com.erik.todoapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.appcompat.widget.Toolbar
import com.erik.todoapp.R
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class CreateTodoActivity : AppCompatActivity() {

    private data class ViewHolder(
        val titleTextInputLayout: TextInputLayout,
        val dataTextInputLayout: TextInputLayout,

        val titleTextInputEditText: TextInputEditText,
        val dataTextInputEditText: TextInputEditText,

        val priorityRadioGroup: RadioGroup,

        val highRadioButton: RadioButton,
        val mediumRadioButton: RadioButton,
        val lowRadioButton: RadioButton,

        val toolbar: Toolbar
    )

    private lateinit var viewHolder:ViewHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_todo)

        this.viewHolder = ViewHolder(
            findViewById(R.id.text_input_layout_create_todo_title),
            findViewById(R.id.text_input_layout_create_todo_data),

            findViewById(R.id.text_input_edit_create_todo_title),
            findViewById(R.id.text_input_edit_create_todo_data),

            findViewById(R.id.radio_group_create_todo_priority),

            findViewById(R.id.radio_button_create_todo_high),
            findViewById(R.id.radio_button_create_todo_medium),
            findViewById(R.id.radio_button_create_todo_low),

            findViewById(R.id.toolbar_create_todo_toolbar)
        )

        setSupportActionBar(viewHolder.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        viewHolder.lowRadioButton.isChecked = true
    }


}
