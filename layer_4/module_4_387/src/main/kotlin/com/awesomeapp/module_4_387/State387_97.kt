package com.awesomeapp.module_4_387

sealed class State387_97 {
    data object Loading : State387_97()
    data class Success(val data: String) : State387_97()
    data class Error(val message: String) : State387_97()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}