package com.awesomeapp.module_1_110

sealed class State110_130 {
    data object Loading : State110_130()
    data class Success(val data: String) : State110_130()
    data class Error(val message: String) : State110_130()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}