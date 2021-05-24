package com.ysfcyln.jetpackcomposepokedex.ui.screen.pokemondetail

import androidx.lifecycle.ViewModel
import com.ysfcyln.jetpackcomposepokedex.domain.Repository
import com.ysfcyln.jetpackcomposepokedex.remote.model.Pokemon
import com.ysfcyln.jetpackcomposepokedex.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private val repository: Repository
) : ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon> {
        return repository.getPokemonInfo(pokemonName)
    }

}