package com.awesomeapp.module_4_380

sealed class State380_11 {
    data object Loading : State380_11()
    data class Success(val data: String) : State380_11()
    data class Error(val message: String) : State380_11()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}