package com.ysfcyln.jetpackcomposepokedex.data

import com.ysfcyln.jetpackcomposepokedex.domain.Repository
import com.ysfcyln.jetpackcomposepokedex.remote.model.Pokemon
import com.ysfcyln.jetpackcomposepokedex.remote.model.PokemonList
import com.ysfcyln.jetpackcomposepokedex.util.Resource
import javax.inject.Inject

/**
 * Implementation class of [Repository]
 */
class PokemonRepositoryImp @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : Repository {

    override suspend fun getPokemonList(limit: Int, offset: Int): Resource<PokemonList> {
        val response = try {
            remoteDataSource.getPokemonList(limit, offset)
        } catch(e: Exception) {
            return Resource.Error("An unknown error occured.")
        }
        return Resource.Success(response)
    }

    override suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        val response = try {
            remoteDataSource.getPokemonInfo(pokemonName)
        } catch(e: Exception) {
            return Resource.Error("An unknown error occured.")
        }
        return Resource.Success(response)
    }
}