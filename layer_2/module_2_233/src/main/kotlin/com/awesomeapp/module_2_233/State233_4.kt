package com.awesomeapp.module_2_233

sealed class State233_4 {
    data object Loading : State233_4()
    data class Success(val data: String) : State233_4()
    data class Error(val message: String) : State233_4()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}