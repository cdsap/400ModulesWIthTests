package com.awesomeapp.module_3_258

sealed class State258_52 {
    data object Loading : State258_52()
    data class Success(val data: String) : State258_52()
    data class Error(val message: String) : State258_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}