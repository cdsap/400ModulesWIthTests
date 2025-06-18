package com.awesomeapp.module_1_94

sealed class State94_145 {
    data object Loading : State94_145()
    data class Success(val data: String) : State94_145()
    data class Error(val message: String) : State94_145()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}