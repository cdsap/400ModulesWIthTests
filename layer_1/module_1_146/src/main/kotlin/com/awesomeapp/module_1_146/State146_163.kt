package com.awesomeapp.module_1_146

sealed class State146_163 {
    data object Loading : State146_163()
    data class Success(val data: String) : State146_163()
    data class Error(val message: String) : State146_163()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}