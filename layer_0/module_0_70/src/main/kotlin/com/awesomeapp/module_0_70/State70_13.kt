package com.awesomeapp.module_0_70

sealed class State70_13 {
    data object Loading : State70_13()
    data class Success(val data: String) : State70_13()
    data class Error(val message: String) : State70_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}