package com.blancofdez.horosapp.domain

import com.blancofdez.horosapp.domain.model.PredictionModel

interface Repository {
    suspend fun getPrediction(sing:String):PredictionModel?
}