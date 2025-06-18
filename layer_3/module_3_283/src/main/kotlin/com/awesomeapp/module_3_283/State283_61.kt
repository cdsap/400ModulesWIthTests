package com.awesomeapp.module_3_283

sealed class State283_61 {
    data object Loading : State283_61()
    data class Success(val data: String) : State283_61()
    data class Error(val message: String) : State283_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}