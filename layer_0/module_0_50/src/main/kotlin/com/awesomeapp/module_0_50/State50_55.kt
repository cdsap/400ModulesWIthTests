package com.awesomeapp.module_0_50

sealed class State50_55 {
    data object Loading : State50_55()
    data class Success(val data: String) : State50_55()
    data class Error(val message: String) : State50_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}