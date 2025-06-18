package com.awesomeapp.module_3_271

sealed class State271_16 {
    data object Loading : State271_16()
    data class Success(val data: String) : State271_16()
    data class Error(val message: String) : State271_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}