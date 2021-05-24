package com.ysfcyln.jetpackcomposepokedex.domain

import com.ysfcyln.jetpackcomposepokedex.remote.model.Pokemon
import com.ysfcyln.jetpackcomposepokedex.remote.model.PokemonList
import com.ysfcyln.jetpackcomposepokedex.util.Resource

/**
 * Methods of Repository
 */
interface Repository {

    suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList>

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>

}