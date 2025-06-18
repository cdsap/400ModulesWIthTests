package com.awesomeapp.module_1_146

sealed class State146_145 {
    data object Loading : State146_145()
    data class Success(val data: String) : State146_145()
    data class Error(val message: String) : State146_145()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}