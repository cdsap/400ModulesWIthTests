package com.awesomeapp.module_3_303

sealed class State303_97 {
    data object Loading : State303_97()
    data class Success(val data: String) : State303_97()
    data class Error(val message: String) : State303_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}