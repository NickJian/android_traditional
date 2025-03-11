package com.example.traditionalandroidproject.api.service

import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import java.net.URL

interface PokeApiService {
	@GET("pokemon")
	suspend fun getPokemon(
		@Query("limit") limit: Int,
		@Query("offset") offset: Int,
	): Response<ApiPokemonCollection>

	@GET("pokemon/{id}")
	suspend fun getPokemonDetails(
		@Path("id") id: Int,
	): Response<ApiPokemonDetails>

	data class ApiPokemonCollection(
		val count: Int,
		val next: String?,
		val previous: String?,
  val pokemon: List<ApiPokemon>,
	)



	data class ApiPokemon(
		val name: String,
		@SerializedName("url") val moreInfoUrl: URL,
	)
	data class ApiPokemonDetails(
		val name: String,
		val order: Int,
		val height: Int,
		val weight: Int,
	)

}