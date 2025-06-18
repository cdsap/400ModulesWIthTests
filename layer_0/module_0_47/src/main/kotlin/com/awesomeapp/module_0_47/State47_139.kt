package com.awesomeapp.module_0_47

sealed class State47_139 {
    data object Loading : State47_139()
    data class Success(val data: String) : State47_139()
    data class Error(val message: String) : State47_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}