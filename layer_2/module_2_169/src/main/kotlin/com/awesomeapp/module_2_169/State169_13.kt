package com.awesomeapp.module_2_169

sealed class State169_13 {
    data object Loading : State169_13()
    data class Success(val data: String) : State169_13()
    data class Error(val message: String) : State169_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}