package com.awesomeapp.module_4_323

sealed class State323_169 {
    data object Loading : State323_169()
    data class Success(val data: String) : State323_169()
    data class Error(val message: String) : State323_169()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}