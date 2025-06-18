package com.awesomeapp.module_2_217

sealed class State217_49 {
    data object Loading : State217_49()
    data class Success(val data: String) : State217_49()
    data class Error(val message: String) : State217_49()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}