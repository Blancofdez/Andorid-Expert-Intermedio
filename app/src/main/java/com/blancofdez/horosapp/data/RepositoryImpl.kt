package com.blancofdez.horosapp.data

import android.util.Log
import com.blancofdez.horosapp.data.network.HoroscopeApiService
import com.blancofdez.horosapp.domain.Repository
import com.blancofdez.horosapp.domain.model.PredictionModel
import javax.inject.Inject

class RepositoryImpl @Inject constructor(private val apiService: HoroscopeApiService) : Repository {
    override suspend fun getPrediction(sing: String): PredictionModel? {
        runCatching { apiService.getHoroscope(sing) }
            .onSuccess { return it.toDomain() }
            .onFailure { Log.i("adan", "HA OCURRIDO UN ERROR ${it.message}") }
        return null
    }
}