package com.awesomeapp.module_0_47

sealed class State47_94 {
    data object Loading : State47_94()
    data class Success(val data: String) : State47_94()
    data class Error(val message: String) : State47_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}