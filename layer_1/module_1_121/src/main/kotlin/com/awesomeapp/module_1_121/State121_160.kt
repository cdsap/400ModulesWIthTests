package com.awesomeapp.module_1_121

sealed class State121_160 {
    data object Loading : State121_160()
    data class Success(val data: String) : State121_160()
    data class Error(val message: String) : State121_160()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}