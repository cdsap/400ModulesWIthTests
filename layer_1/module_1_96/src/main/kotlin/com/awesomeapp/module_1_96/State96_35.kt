package com.awesomeapp.module_1_96

sealed class State96_35 {
    data object Loading : State96_35()
    data class Success(val data: String) : State96_35()
    data class Error(val message: String) : State96_35()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}