package com.awesomeapp.module_2_164

sealed class State164_92 {
    data object Loading : State164_92()
    data class Success(val data: String) : State164_92()
    data class Error(val message: String) : State164_92()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}