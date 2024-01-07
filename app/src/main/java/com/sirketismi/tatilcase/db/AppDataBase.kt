package com.sirketismi.tatilcase.db

import android.content.Context
import android.os.Build.VERSION
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.sirketismi.tatilcase.model.User


@Database(entities = [User::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    abstract fun userDao(): User

    companion object {
        private var database : AppDataBase? = null

        fun getDatabase(context: Context) : AppDataBase {
            if(database != null) {
                return database!!
            } else {
                val instance = Room.databaseBuilder(
                    context,
                    AppDataBase::class.java,
                    "xsxms").build()

                database = instance
                return database!!
            }
        }
    }
}