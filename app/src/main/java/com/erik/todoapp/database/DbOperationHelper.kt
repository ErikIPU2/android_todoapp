package com.erik.todoapp.database

import android.content.ContentValues
import android.content.Context
import android.provider.BaseColumns
import com.erik.todoapp.database.user.UserContract.UserEntry
import com.erik.todoapp.util.data.User

class DbOperationHelper(context: Context) {
    val dbHelper = DbHelper(context)

    fun addUser(user: User): Long? {
        val db = dbHelper.writableDatabase

        val values = ContentValues().apply {
            put(UserEntry.COLUMN_NAME_NAME, user.name)
            put(UserEntry.COLUMN_NAME_EMAIL, user.email)
            put(UserEntry.COLUMN_NAME_PASSWORD, user.password)
        }

        val newRowId = db?.insert(UserEntry.TABLE_NAME, null, values)

        return newRowId
    }

    fun getUsers():Array<User> {
        val db = dbHelper.readableDatabase

        val projection = arrayOf(BaseColumns._ID, UserEntry.COLUMN_NAME_NAME,
            UserEntry.COLUMN_NAME_EMAIL, UserEntry.COLUMN_NAME_PASSWORD)

        val cursor = db.query(
            UserEntry.TABLE_NAME,
            projection,
            null,
            null,
            null,
            null,
            null
        )

        val users = mutableListOf<User>()

        with (cursor) {
            while (moveToNext()) {
                val id = getLong(getColumnIndex(BaseColumns._ID))
                val name = getString(getColumnIndex(UserEntry.COLUMN_NAME_NAME))
                val password = getString(getColumnIndex(UserEntry.COLUMN_NAME_PASSWORD))
                val email = getString(getColumnIndex(UserEntry.COLUMN_NAME_EMAIL))

                val user = User(id, name, email, password)
                users.add(user)
            }
        }

        return users.toTypedArray()
    }
}