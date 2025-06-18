package com.awesomeapp.module_2_171

sealed class State171_7 {
    data object Loading : State171_7()
    data class Success(val data: String) : State171_7()
    data class Error(val message: String) : State171_7()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}