package com.sirketismi.tatilcase.dao

import androidx.lifecycle.LiveData
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.sirketismi.tatilcase.model.User

interface UserDao {

    @Insert
    suspend fun insert(user: User)

    @Query("SELECT*FROM user")
    fun getAll() : LiveData<List<User>>

    @Query("SELECT*FROM user where first_name LIKE :name AND last_name LIKE :lastname")
    fun findwithNameAndSurname(name: String, lastname: String) : List<User>

    @Delete
    fun delete(user: User)

}