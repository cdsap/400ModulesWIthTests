package com.awesomeapp.module_0_54

sealed class State54_97 {
    data object Loading : State54_97()
    data class Success(val data: String) : State54_97()
    data class Error(val message: String) : State54_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}