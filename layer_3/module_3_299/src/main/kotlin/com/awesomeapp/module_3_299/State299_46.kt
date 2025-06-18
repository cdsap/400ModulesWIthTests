package com.awesomeapp.module_3_299

sealed class State299_46 {
    data object Loading : State299_46()
    data class Success(val data: String) : State299_46()
    data class Error(val message: String) : State299_46()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}