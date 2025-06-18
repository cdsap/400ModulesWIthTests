package com.awesomeapp.module_3_317

sealed class State317_28 {
    data object Loading : State317_28()
    data class Success(val data: String) : State317_28()
    data class Error(val message: String) : State317_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}