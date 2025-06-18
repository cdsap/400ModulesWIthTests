package com.awesomeapp.module_1_105

sealed class State105_106 {
    data object Loading : State105_106()
    data class Success(val data: String) : State105_106()
    data class Error(val message: String) : State105_106()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}