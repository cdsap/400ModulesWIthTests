package com.awesomeapp.module_1_151

sealed class State151_184 {
    data object Loading : State151_184()
    data class Success(val data: String) : State151_184()
    data class Error(val message: String) : State151_184()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}