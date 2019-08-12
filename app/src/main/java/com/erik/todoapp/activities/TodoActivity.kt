package com.erik.todoapp.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.widget.Toolbar
import com.erik.todoapp.R
import com.erik.todoapp.util.Session

class TodoActivity : AppCompatActivity() {

    private data class ViewHolder(
        val toolbar: Toolbar
    )

    private lateinit var viewHolder: ViewHolder
    private lateinit var session: Session

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_todo)

        this.session = Session(this)

        this.viewHolder = ViewHolder(
            findViewById(R.id.toolbar_todo_toolbar)
        )

        setSupportActionBar(viewHolder.toolbar)
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

    private fun close() {
        this.finish()
    }
}
