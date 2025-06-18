package com.awesomeapp.module_3_299

sealed class State299_19 {
    data object Loading : State299_19()
    data class Success(val data: String) : State299_19()
    data class Error(val message: String) : State299_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}