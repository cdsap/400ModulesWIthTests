package com.awesomeapp.module_4_394

sealed class State394_88 {
    data object Loading : State394_88()
    data class Success(val data: String) : State394_88()
    data class Error(val message: String) : State394_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}