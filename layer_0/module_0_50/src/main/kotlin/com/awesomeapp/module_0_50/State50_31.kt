package com.awesomeapp.module_0_50

sealed class State50_31 {
    data object Loading : State50_31()
    data class Success(val data: String) : State50_31()
    data class Error(val message: String) : State50_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}