package com.awesomeapp.module_1_144

sealed class State144_107 {
    data object Loading : State144_107()
    data class Success(val data: String) : State144_107()
    data class Error(val message: String) : State144_107()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}