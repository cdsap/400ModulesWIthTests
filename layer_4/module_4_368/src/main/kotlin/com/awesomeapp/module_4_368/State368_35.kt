package com.awesomeapp.module_4_368

sealed class State368_35 {
    data object Loading : State368_35()
    data class Success(val data: String) : State368_35()
    data class Error(val message: String) : State368_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}