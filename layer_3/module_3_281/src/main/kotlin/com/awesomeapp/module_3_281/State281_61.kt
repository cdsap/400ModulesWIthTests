package com.awesomeapp.module_3_281

sealed class State281_61 {
    data object Loading : State281_61()
    data class Success(val data: String) : State281_61()
    data class Error(val message: String) : State281_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}