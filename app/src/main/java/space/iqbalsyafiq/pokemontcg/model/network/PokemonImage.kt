package space.iqbalsyafiq.pokemontcg.model.network

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class PokemonImage(
    val small: String,
    val large: String
) : Parcelable
