package com.awesomeapp.module_0_18

sealed class State18_7 {
    data object Loading : State18_7()
    data class Success(val data: String) : State18_7()
    data class Error(val message: String) : State18_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}