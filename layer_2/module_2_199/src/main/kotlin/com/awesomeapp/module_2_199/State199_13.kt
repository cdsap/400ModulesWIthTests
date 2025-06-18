package com.awesomeapp.module_2_199

sealed class State199_13 {
    data object Loading : State199_13()
    data class Success(val data: String) : State199_13()
    data class Error(val message: String) : State199_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}