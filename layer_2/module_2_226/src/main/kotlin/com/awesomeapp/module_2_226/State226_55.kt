package com.awesomeapp.module_2_226

sealed class State226_55 {
    data object Loading : State226_55()
    data class Success(val data: String) : State226_55()
    data class Error(val message: String) : State226_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}