package com.awesomeapp.module_2_187

sealed class State187_97 {
    data object Loading : State187_97()
    data class Success(val data: String) : State187_97()
    data class Error(val message: String) : State187_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}