package cz.muni.fi.pv256.hw9.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
@Entity
data class Character(
    @PrimaryKey val id: Int,
    @ColumnInfo(name = "name") @field:Json(name = "name") val name: String,
    @ColumnInfo(name = "status") @field:Json(name = "status") val status: String,
    @ColumnInfo(name = "species") @field:Json(name = "species") val species: String,
    @ColumnInfo(name = "gender") @field:Json(name = "gender") val gender: String,
    @ColumnInfo(name = "image") @field:Json(name = "image") val image: String,
)
