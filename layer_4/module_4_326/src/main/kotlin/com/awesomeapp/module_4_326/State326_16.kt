package com.awesomeapp.module_4_326

sealed class State326_16 {
    data object Loading : State326_16()
    data class Success(val data: String) : State326_16()
    data class Error(val message: String) : State326_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}