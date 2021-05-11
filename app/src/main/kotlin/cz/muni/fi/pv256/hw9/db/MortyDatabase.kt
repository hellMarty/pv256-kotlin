package cz.muni.fi.pv256.hw9.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import cz.muni.fi.pv256.hw9.data.Character


@Database(entities = [Character::class], version = 1)
abstract class MortyDatabase : RoomDatabase() {
    abstract fun characterDao() : CharacterDao

    companion object {
        private var instance: MortyDatabase? = null

        fun getInstance(context: Context): MortyDatabase {
            if (instance == null) {
                instance = Room.databaseBuilder(context, MortyDatabase::class.java, "mortys").build()
            }
            return instance!!
        }
    }
}
