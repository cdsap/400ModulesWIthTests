package com.awesomeapp.module_0_47

sealed class State47_28 {
    data object Loading : State47_28()
    data class Success(val data: String) : State47_28()
    data class Error(val message: String) : State47_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}