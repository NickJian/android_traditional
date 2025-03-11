package com.example.traditionalandroidproject.repository

import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.flow.Flow
import retrofit2.Retrofit
import javax.inject.Inject

//@InstallIn(SingletonComponent::class)
//interface PokeListRepository {
//	//todo add room
//	suspend fun getPokemon(limit: Int, offset: Int)
//}
//
//class  PokeListRepositoryImpl @Inject constructor(val retrofit : Retrofit){
//
//
//
//}