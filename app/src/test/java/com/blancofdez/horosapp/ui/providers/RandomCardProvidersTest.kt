package com.blancofdez.horosapp.ui.providers

import org.junit.Assert.*
import org.junit.Test

class RandomCardProvidersTest{


    @Test
    fun `getRandomCard should return a random card`(){

        //Given
        val randomCard = RandomCardProviders()

        //When
        val card = randomCard.getLucky()

        //Then
        assertNotNull(card)
    }


}