package com.awesomeapp.module_0_51

sealed class State51_61 {
    data object Loading : State51_61()
    data class Success(val data: String) : State51_61()
    data class Error(val message: String) : State51_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}