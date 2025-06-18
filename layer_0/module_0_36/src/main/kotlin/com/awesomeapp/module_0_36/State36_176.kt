package com.awesomeapp.module_0_36

sealed class State36_176 {
    data object Loading : State36_176()
    data class Success(val data: String) : State36_176()
    data class Error(val message: String) : State36_176()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}