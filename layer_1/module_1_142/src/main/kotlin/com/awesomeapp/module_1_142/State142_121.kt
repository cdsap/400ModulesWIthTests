package com.awesomeapp.module_1_142

sealed class State142_121 {
    data object Loading : State142_121()
    data class Success(val data: String) : State142_121()
    data class Error(val message: String) : State142_121()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}