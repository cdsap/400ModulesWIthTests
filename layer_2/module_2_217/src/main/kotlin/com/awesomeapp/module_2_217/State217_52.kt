package com.awesomeapp.module_2_217

sealed class State217_52 {
    data object Loading : State217_52()
    data class Success(val data: String) : State217_52()
    data class Error(val message: String) : State217_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}