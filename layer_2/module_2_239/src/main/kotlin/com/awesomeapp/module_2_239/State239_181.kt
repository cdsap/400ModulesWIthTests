package com.awesomeapp.module_2_239

sealed class State239_181 {
    data object Loading : State239_181()
    data class Success(val data: String) : State239_181()
    data class Error(val message: String) : State239_181()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}