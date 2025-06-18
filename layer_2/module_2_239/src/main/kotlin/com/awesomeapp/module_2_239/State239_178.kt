package com.awesomeapp.module_2_239

sealed class State239_178 {
    data object Loading : State239_178()
    data class Success(val data: String) : State239_178()
    data class Error(val message: String) : State239_178()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}