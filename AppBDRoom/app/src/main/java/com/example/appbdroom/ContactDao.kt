package com.example.appbdroom

import androidx.room.*

@Dao
interface ContactDao {
    //Room solo trabaja con List y cursores
    @Query("select * from Contact")
    fun getAll(): List<Contact>

    @Insert
    fun insertContact(vararg contacts: Contact)

    @Delete
    fun deleteContact(vararg contacts: Contact)

    @Update
    fun updateContact(vararg contacts: Contact)
}