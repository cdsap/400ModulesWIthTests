package com.awesomeapp.module_1_94

sealed class State94_52 {
    data object Loading : State94_52()
    data class Success(val data: String) : State94_52()
    data class Error(val message: String) : State94_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}