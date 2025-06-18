package com.awesomeapp.module_0_2

sealed class State2_61 {
    data object Loading : State2_61()
    data class Success(val data: String) : State2_61()
    data class Error(val message: String) : State2_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}