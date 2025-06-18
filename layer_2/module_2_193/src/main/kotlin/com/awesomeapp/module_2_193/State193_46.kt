package com.awesomeapp.module_2_193

sealed class State193_46 {
    data object Loading : State193_46()
    data class Success(val data: String) : State193_46()
    data class Error(val message: String) : State193_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}