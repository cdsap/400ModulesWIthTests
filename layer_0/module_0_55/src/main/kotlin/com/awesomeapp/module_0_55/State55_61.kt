package com.awesomeapp.module_0_55

sealed class State55_61 {
    data object Loading : State55_61()
    data class Success(val data: String) : State55_61()
    data class Error(val message: String) : State55_61()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}