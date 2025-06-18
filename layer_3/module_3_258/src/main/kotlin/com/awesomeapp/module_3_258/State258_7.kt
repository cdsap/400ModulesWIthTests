package com.awesomeapp.module_3_258

sealed class State258_7 {
    data object Loading : State258_7()
    data class Success(val data: String) : State258_7()
    data class Error(val message: String) : State258_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}