package cz.muni.fi.pv256.hw9.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import cz.muni.fi.pv256.hw9.data.Character
import kotlinx.coroutines.*

@Dao
interface CharacterDao {
    @Query("SELECT * FROM character")
    fun getAll(): LiveData<List<Character>>

    @Query("SELECT * FROM character WHERE id IN (:id)")
    fun loadById(id: Int): LiveData<Character>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insertAll(vararg characters: Character)

    @Delete
    fun delete(character: Character)
}
