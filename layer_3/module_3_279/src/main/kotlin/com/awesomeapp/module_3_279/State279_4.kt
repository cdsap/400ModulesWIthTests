package com.awesomeapp.module_3_279

sealed class State279_4 {
    data object Loading : State279_4()
    data class Success(val data: String) : State279_4()
    data class Error(val message: String) : State279_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}