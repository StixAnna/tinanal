package com.example.a123

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.util.Log
import androidx.core.content.contentValuesOf
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import org.json.JSONObject

//class dbHelper(val context: Context, factory: SQLiteDatabase.CursorFactory?) :
   /* SQLiteOpenHelper(context, "app", factory, 1) {
    override fun onCreate(db: SQLiteDatabase?) {
        val querry = "  CREATE TABLE users (id INT PRIMARY KEY, name TEXT, login TEXT, pswd TEXT," +
                    "   telegram TEXT DEFAULT NULL," +
                    "   city TEXT DEFAULT NULL," +
                    "   gender TEXT NOT NULL DEFAULT 'Other'," +
                    "   about TEXT DEFAULT NULL)"
        db!!.execSQL(querry)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS users")
        onCreate(db)
    }
    fun adduser(user : User){
        val values = contentValuesOf()
        values.put("name", user.name)
        values.put("login", user.login)
        values.put("pswd", user.pswd)

        val db = this.writableDatabase
        db.insert("users", null, values)

        db.close()
    }

    fun getUser(login: String, pswd: String) : Boolean{
        val db = this.readableDatabase

        val result = db.rawQuery("SELECT * FROM users WHERE login = '$login' AND pswd = '$pswd'", null)
        return result.moveToFirst()
    }*/


//}