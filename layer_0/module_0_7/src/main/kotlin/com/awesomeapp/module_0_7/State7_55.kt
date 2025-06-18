package com.awesomeapp.module_0_7

sealed class State7_55 {
    data object Loading : State7_55()
    data class Success(val data: String) : State7_55()
    data class Error(val message: String) : State7_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}