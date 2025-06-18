package com.awesomeapp.module_3_317

sealed class State317_7 {
    data object Loading : State317_7()
    data class Success(val data: String) : State317_7()
    data class Error(val message: String) : State317_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}