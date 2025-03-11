package com.example.traditionalandroidproject.api.module

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
class RetrofitModule {

	@Provides
	fun provideRetrofit(): Retrofit{
		return Retrofit.Builder()
			.baseUrl("https://pokeapi.co/api/v2/")
			.addConverterFactory(GsonConverterFactory.create())
			.build()
	}
}