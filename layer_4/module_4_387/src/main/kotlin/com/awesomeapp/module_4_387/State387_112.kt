package com.awesomeapp.module_4_387

sealed class State387_112 {
    data object Loading : State387_112()
    data class Success(val data: String) : State387_112()
    data class Error(val message: String) : State387_112()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}