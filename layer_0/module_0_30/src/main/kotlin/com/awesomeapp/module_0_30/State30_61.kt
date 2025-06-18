package com.awesomeapp.module_0_30

sealed class State30_61 {
    data object Loading : State30_61()
    data class Success(val data: String) : State30_61()
    data class Error(val message: String) : State30_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}