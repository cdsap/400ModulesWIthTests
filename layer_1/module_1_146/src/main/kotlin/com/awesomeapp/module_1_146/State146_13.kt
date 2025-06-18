package com.awesomeapp.module_1_146

sealed class State146_13 {
    data object Loading : State146_13()
    data class Success(val data: String) : State146_13()
    data class Error(val message: String) : State146_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}