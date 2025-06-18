package com.awesomeapp.module_0_65

sealed class State65_88 {
    data object Loading : State65_88()
    data class Success(val data: String) : State65_88()
    data class Error(val message: String) : State65_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}