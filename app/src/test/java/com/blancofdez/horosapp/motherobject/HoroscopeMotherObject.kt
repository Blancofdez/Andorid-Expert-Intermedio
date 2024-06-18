package com.blancofdez.horosapp.motherobject

import com.blancofdez.horosapp.data.network.response.PredictionResponse
import com.blancofdez.horosapp.domain.model.HoroscopeInfo
import com.blancofdez.horosapp.domain.model.HoroscopeInfo.*

object HoroscopeMotherObject {
    val anyResponse = PredictionResponse("date", "prediction", "taurus")
    val horoscopeInfoList = listOf(
        Aries,
        Taurus,
        Gemini,
        Cancer,
        Leo,
        Virgo,
        Libra,
        Scorpio,
        Sagittarius,
        Capricorn,
        Aquarius,
        Pisces
    )
}