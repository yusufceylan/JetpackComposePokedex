package com.ysfcyln.jetpackcomposepokedex.remote.source

import com.ysfcyln.jetpackcomposepokedex.data.RemoteDataSource
import com.ysfcyln.jetpackcomposepokedex.remote.api.PokeApi
import com.ysfcyln.jetpackcomposepokedex.remote.model.Pokemon
import com.ysfcyln.jetpackcomposepokedex.remote.model.PokemonList
import javax.inject.Inject

/**
 * Implementation class of [RemoteDataSource]
 */
class RemoteDataSourceImp @Inject constructor(
    private val api: PokeApi
) : RemoteDataSource {

    override suspend fun getPokemonList(limit: Int, offset: Int): PokemonList {
        return api.getPokemonList(limit = limit, offset = offset)
    }

    override suspend fun getPokemonInfo(pokemonName: String): Pokemon {
        return api.getPokemonInfo(name = pokemonName)
    }
}