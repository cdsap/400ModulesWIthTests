package com.awesomeapp.module_0_50

sealed class State50_145 {
    data object Loading : State50_145()
    data class Success(val data: String) : State50_145()
    data class Error(val message: String) : State50_145()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}