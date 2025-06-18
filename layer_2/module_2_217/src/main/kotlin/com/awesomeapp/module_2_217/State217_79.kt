package com.awesomeapp.module_2_217

sealed class State217_79 {
    data object Loading : State217_79()
    data class Success(val data: String) : State217_79()
    data class Error(val message: String) : State217_79()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}