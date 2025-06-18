package com.awesomeapp.module_2_193

sealed class State193_31 {
    data object Loading : State193_31()
    data class Success(val data: String) : State193_31()
    data class Error(val message: String) : State193_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}