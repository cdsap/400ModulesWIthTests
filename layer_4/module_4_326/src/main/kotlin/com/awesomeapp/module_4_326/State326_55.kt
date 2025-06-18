package com.awesomeapp.module_4_326

sealed class State326_55 {
    data object Loading : State326_55()
    data class Success(val data: String) : State326_55()
    data class Error(val message: String) : State326_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}