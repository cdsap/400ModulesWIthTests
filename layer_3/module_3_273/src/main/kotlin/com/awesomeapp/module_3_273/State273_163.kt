package com.awesomeapp.module_3_273

sealed class State273_163 {
    data object Loading : State273_163()
    data class Success(val data: String) : State273_163()
    data class Error(val message: String) : State273_163()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}