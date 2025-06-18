package com.awesomeapp.module_2_181

sealed class State181_103 {
    data object Loading : State181_103()
    data class Success(val data: String) : State181_103()
    data class Error(val message: String) : State181_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}