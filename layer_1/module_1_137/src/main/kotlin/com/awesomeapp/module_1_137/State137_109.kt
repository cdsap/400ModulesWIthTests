package com.awesomeapp.module_1_137

sealed class State137_109 {
    data object Loading : State137_109()
    data class Success(val data: String) : State137_109()
    data class Error(val message: String) : State137_109()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}