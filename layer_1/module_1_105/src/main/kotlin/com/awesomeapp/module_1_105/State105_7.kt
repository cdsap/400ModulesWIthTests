package com.awesomeapp.module_1_105

sealed class State105_7 {
    data object Loading : State105_7()
    data class Success(val data: String) : State105_7()
    data class Error(val message: String) : State105_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}