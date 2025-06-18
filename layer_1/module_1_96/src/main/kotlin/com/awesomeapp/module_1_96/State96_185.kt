package com.awesomeapp.module_1_96

sealed class State96_185 {
    data object Loading : State96_185()
    data class Success(val data: String) : State96_185()
    data class Error(val message: String) : State96_185()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}