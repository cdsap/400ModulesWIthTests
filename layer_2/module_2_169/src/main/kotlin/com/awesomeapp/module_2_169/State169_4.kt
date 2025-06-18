package com.awesomeapp.module_2_169

sealed class State169_4 {
    data object Loading : State169_4()
    data class Success(val data: String) : State169_4()
    data class Error(val message: String) : State169_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}