package com.ysfcyln.jetpackcomposepokedex.remote.api

import com.ysfcyln.jetpackcomposepokedex.remote.model.Pokemon
import com.ysfcyln.jetpackcomposepokedex.remote.model.PokemonList
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface PokeApi {

    @GET("pokemon")
    suspend fun getPokemonList(
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): PokemonList

    @GET("pokemon/{name}")
    suspend fun getPokemonInfo(
        @Path("name") name: String
    ): Pokemon
}