package com.erik.todoapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.Toolbar
import com.erik.todoapp.R

class CreateTodoActivity : AppCompatActivity() {

    private data class ViewHolder(
        val toolbar: Toolbar
    )

    private lateinit var viewHolder:ViewHolder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_todo)

        this.viewHolder = ViewHolder(
            findViewById(R.id.toolbar_create_todo_toolbar)
        )

        setSupportActionBar(viewHolder.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }


}
