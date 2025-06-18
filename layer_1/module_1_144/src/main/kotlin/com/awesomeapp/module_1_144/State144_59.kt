package com.awesomeapp.module_1_144

sealed class State144_59 {
    data object Loading : State144_59()
    data class Success(val data: String) : State144_59()
    data class Error(val message: String) : State144_59()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}