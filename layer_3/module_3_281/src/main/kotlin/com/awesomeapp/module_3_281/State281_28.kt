package com.awesomeapp.module_3_281

sealed class State281_28 {
    data object Loading : State281_28()
    data class Success(val data: String) : State281_28()
    data class Error(val message: String) : State281_28()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}