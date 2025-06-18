package com.awesomeapp.module_0_14

sealed class State14_88 {
    data object Loading : State14_88()
    data class Success(val data: String) : State14_88()
    data class Error(val message: String) : State14_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}