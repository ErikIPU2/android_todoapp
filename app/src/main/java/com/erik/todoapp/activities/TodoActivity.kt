package com.erik.todoapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.appcompat.widget.Toolbar
import com.erik.todoapp.R
import com.erik.todoapp.util.Session
import com.google.android.material.floatingactionbutton.FloatingActionButton

class TodoActivity : AppCompatActivity() {

    private data class ViewHolder(
        val toolbar: Toolbar,
        val addTodoFloatingActionButton: FloatingActionButton
    )

    private lateinit var viewHolder: ViewHolder
    private lateinit var session: Session

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)

        this.session = Session(this)

        this.viewHolder = ViewHolder(
            findViewById(R.id.toolbar_todo_toolbar),
            findViewById(R.id.fab_todo_add_todo)
        )

        setSupportActionBar(viewHolder.toolbar)
        viewHolder.addTodoFloatingActionButton.setOnClickListener(this.fabAddTodoOnClick)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_todo_itens, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.action_todo_logout -> {
            this.session.logout()
            this.close()
            true
        } else -> {
            super.onOptionsItemSelected(item)
        }
    }

    private val fabAddTodoOnClick = View.OnClickListener { view ->
        Toast.makeText(this, "Tu APERTOU NO FAB MANOOOOOOOOOOOOOOOOOOOOO", Toast.LENGTH_SHORT).show()
    }

    private fun close() {
        this.finish()
    }
}
