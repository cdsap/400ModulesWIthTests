package com.awesomeapp.module_2_199

sealed class State199_28 {
    data object Loading : State199_28()
    data class Success(val data: String) : State199_28()
    data class Error(val message: String) : State199_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}