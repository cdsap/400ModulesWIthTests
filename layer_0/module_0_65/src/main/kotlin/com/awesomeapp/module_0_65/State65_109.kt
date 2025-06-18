package com.awesomeapp.module_0_65

sealed class State65_109 {
    data object Loading : State65_109()
    data class Success(val data: String) : State65_109()
    data class Error(val message: String) : State65_109()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}