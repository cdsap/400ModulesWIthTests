package com.awesomeapp.module_2_197

sealed class State197_25 {
    data object Loading : State197_25()
    data class Success(val data: String) : State197_25()
    data class Error(val message: String) : State197_25()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}