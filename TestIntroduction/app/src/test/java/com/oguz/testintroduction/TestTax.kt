package com.oguz.testintroduction

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test


class TestTax {

    private lateinit var tax : Tax

    @Before
    fun setup() {
        tax = Tax()
    }


    @After
    fun teardown() {


    }

    @Test
    fun calculateTaxTest(){

        val netTax = tax.calculateTax(100.0,0.1)
        //assertThat -> Bu buna eşitse çok iyi değilse hata ver manasına geliyor.
        assertThat(netTax).isEqualTo(10)  //10 a eşitse okey değilse uygulama çöker
    }

    @Test
    fun calculateIncomeTest(){


        val netIncome = tax.calculateIncome(200.0,0.2)
        assertThat(netIncome).isEqualTo(160)
    }
}