package com.awesomeapp.module_4_394

sealed class State394_115 {
    data object Loading : State394_115()
    data class Success(val data: String) : State394_115()
    data class Error(val message: String) : State394_115()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}