package com.awesomeapp.module_3_279

sealed class State279_13 {
    data object Loading : State279_13()
    data class Success(val data: String) : State279_13()
    data class Error(val message: String) : State279_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}