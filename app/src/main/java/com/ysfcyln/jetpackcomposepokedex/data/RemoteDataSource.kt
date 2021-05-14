package com.ysfcyln.jetpackcomposepokedex.data

import com.ysfcyln.jetpackcomposepokedex.remote.model.Pokemon
import com.ysfcyln.jetpackcomposepokedex.remote.model.PokemonList

/**
 * Methods of Remote Data Source
 */
interface RemoteDataSource {

    suspend fun getPokemonList(limit: Int, offset: Int): PokemonList

    suspend fun getPokemonInfo(pokemonName: String): Pokemon

}