package com.awesomeapp.module_3_301

sealed class State301_55 {
    data object Loading : State301_55()
    data class Success(val data: String) : State301_55()
    data class Error(val message: String) : State301_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}