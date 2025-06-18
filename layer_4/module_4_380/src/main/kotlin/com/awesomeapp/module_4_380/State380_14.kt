package com.awesomeapp.module_4_380

sealed class State380_14 {
    data object Loading : State380_14()
    data class Success(val data: String) : State380_14()
    data class Error(val message: String) : State380_14()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}