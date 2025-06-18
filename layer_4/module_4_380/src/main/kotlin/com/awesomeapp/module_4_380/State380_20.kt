package com.awesomeapp.module_4_380

sealed class State380_20 {
    data object Loading : State380_20()
    data class Success(val data: String) : State380_20()
    data class Error(val message: String) : State380_20()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}