package com.awesomeapp.module_2_235

sealed class State235_55 {
    data object Loading : State235_55()
    data class Success(val data: String) : State235_55()
    data class Error(val message: String) : State235_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}