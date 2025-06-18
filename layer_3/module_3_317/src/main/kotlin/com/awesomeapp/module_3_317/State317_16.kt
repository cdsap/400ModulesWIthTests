package com.awesomeapp.module_3_317

sealed class State317_16 {
    data object Loading : State317_16()
    data class Success(val data: String) : State317_16()
    data class Error(val message: String) : State317_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}