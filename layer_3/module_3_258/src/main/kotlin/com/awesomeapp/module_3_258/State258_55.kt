package com.awesomeapp.module_3_258

sealed class State258_55 {
    data object Loading : State258_55()
    data class Success(val data: String) : State258_55()
    data class Error(val message: String) : State258_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}