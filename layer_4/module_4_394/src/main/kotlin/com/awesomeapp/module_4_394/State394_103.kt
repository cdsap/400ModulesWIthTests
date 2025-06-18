package com.awesomeapp.module_4_394

sealed class State394_103 {
    data object Loading : State394_103()
    data class Success(val data: String) : State394_103()
    data class Error(val message: String) : State394_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}