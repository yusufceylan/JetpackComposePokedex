package com.ysfcyln.jetpackcomposepokedex.di

import com.ysfcyln.jetpackcomposepokedex.data.PokemonRepositoryImp
import com.ysfcyln.jetpackcomposepokedex.data.RemoteDataSource
import com.ysfcyln.jetpackcomposepokedex.domain.Repository
import com.ysfcyln.jetpackcomposepokedex.remote.source.RemoteDataSourceImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

/**
 * Module that holds Repository classes
 */
@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun provideRemoteDataSource(remoteDataSourceImp: RemoteDataSourceImp): RemoteDataSource

    @Binds
    @ViewModelScoped
    abstract fun provideRepository(repository : PokemonRepositoryImp) : Repository

}