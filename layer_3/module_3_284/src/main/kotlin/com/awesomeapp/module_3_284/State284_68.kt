package com.awesomeapp.module_3_284

sealed class State284_68 {
    data object Loading : State284_68()
    data class Success(val data: String) : State284_68()
    data class Error(val message: String) : State284_68()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}