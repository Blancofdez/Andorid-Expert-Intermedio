package com.blancofdez.horosapp.data.network.response

import com.blancofdez.horosapp.motherobject.HoroscopeMotherObject.anyResponse
import io.kotlintest.shouldBe
import org.junit.Test
import kotlin.math.sign

class PredictionResponseTest{
    @Test
    fun `toDomain Should Return a Correct Prediction Model`(){

        //Given

            //Modificar el objeto madre
        //val horoscopeResponse = anyResponse.copy(sign = "libra")
        val horoscopeResponse = anyResponse

        //When

        val predictionModel = horoscopeResponse.toDomain()


        //Then

        predictionModel.sign shouldBe  horoscopeResponse.sign
        predictionModel.horoscope shouldBe horoscopeResponse.horoscope
    }


}