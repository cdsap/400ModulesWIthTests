package com.awesomeapp.module_3_283

sealed class State283_4 {
    data object Loading : State283_4()
    data class Success(val data: String) : State283_4()
    data class Error(val message: String) : State283_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}