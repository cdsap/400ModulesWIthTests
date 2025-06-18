package com.awesomeapp.module_4_394

sealed class State394_127 {
    data object Loading : State394_127()
    data class Success(val data: String) : State394_127()
    data class Error(val message: String) : State394_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}