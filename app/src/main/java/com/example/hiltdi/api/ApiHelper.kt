package com.example.hiltdi.api

import com.example.hiltdi.model.User
import retrofit2.Response

interface ApiHelper {

    suspend fun getUsers():Response<List<User>>
}