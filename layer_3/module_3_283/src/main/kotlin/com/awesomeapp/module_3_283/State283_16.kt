package com.awesomeapp.module_3_283

sealed class State283_16 {
    data object Loading : State283_16()
    data class Success(val data: String) : State283_16()
    data class Error(val message: String) : State283_16()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}