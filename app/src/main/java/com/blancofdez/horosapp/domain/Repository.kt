package com.blancofdez.horosapp.domain

import com.blancofdez.horosapp.data.providers.network.response.PredictionResponse
import com.blancofdez.horosapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sing:String):PredictionModel?
}