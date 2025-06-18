package com.awesomeapp.module_0_38

sealed class State38_163 {
    data object Loading : State38_163()
    data class Success(val data: String) : State38_163()
    data class Error(val message: String) : State38_163()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}