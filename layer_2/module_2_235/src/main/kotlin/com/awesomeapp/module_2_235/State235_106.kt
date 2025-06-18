package com.awesomeapp.module_2_235

sealed class State235_106 {
    data object Loading : State235_106()
    data class Success(val data: String) : State235_106()
    data class Error(val message: String) : State235_106()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}