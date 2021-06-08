package cz.muni.fi.pv256.hw9.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CharacterList(
    val characters: List<Character>
)
