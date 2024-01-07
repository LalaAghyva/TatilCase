package com.sirketismi.tatilcase.repository

import androidx.lifecycle.LiveData
import com.sirketismi.tatilcase.dao.UserDao
import com.sirketismi.tatilcase.model.User

class UserRepository(private val userDao: UserDao) {
    suspend fun insert(user : User) {
        userDao.insert(user)
    }

    fun getAll() : LiveData<List<User>> {
        return userDao.getAll()
    }
}