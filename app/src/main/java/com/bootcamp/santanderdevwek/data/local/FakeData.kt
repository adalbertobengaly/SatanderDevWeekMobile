package com.bootcamp.santanderdevwek.data.local

import com.bootcamp.santanderdevwek.data.Cartao
import com.bootcamp.santanderdevwek.data.Cliente
import com.bootcamp.santanderdevwek.data.Conta

class FakeData{


    fun getLocalData(): Conta {
        val cliente = Cliente("Adalberto")
        val cartao = Cartao("223465197")

        return Conta(
            "442654-9",
            "6552-4",
            "3.956.49",
            "7.000,00",
            cliente,
            cartao
        )
    }
}