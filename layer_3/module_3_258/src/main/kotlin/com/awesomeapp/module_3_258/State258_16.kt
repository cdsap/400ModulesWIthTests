package com.awesomeapp.module_3_258

sealed class State258_16 {
    data object Loading : State258_16()
    data class Success(val data: String) : State258_16()
    data class Error(val message: String) : State258_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}