package com.awesomeapp.module_2_235

sealed class State235_49 {
    data object Loading : State235_49()
    data class Success(val data: String) : State235_49()
    data class Error(val message: String) : State235_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}