package com.awesomeapp.module_3_279

sealed class State279_46 {
    data object Loading : State279_46()
    data class Success(val data: String) : State279_46()
    data class Error(val message: String) : State279_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}