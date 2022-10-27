package com.subashz.ricknmorty.data.remote

import com.subashz.ricknmorty.data.model.Character
import com.subashz.ricknmorty.data.model.CharacterList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface CharacterService {
    @GET("character")
    suspend fun getAllCharacters() : Response<CharacterList>

    @GET("character/{id}")
    suspend fun getCharacter(@Path("id") id: Int): Response<Character>
}