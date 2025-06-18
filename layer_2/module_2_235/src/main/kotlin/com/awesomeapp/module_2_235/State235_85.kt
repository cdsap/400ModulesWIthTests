package com.awesomeapp.module_2_235

sealed class State235_85 {
    data object Loading : State235_85()
    data class Success(val data: String) : State235_85()
    data class Error(val message: String) : State235_85()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}