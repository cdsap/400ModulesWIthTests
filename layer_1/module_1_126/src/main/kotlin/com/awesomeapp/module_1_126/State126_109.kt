package com.awesomeapp.module_1_126

sealed class State126_109 {
    data object Loading : State126_109()
    data class Success(val data: String) : State126_109()
    data class Error(val message: String) : State126_109()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}