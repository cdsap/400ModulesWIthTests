package com.awesomeapp.module_2_239

sealed class State239_94 {
    data object Loading : State239_94()
    data class Success(val data: String) : State239_94()
    data class Error(val message: String) : State239_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}