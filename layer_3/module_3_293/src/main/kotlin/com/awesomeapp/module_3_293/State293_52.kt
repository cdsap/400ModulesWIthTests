package com.awesomeapp.module_3_293

sealed class State293_52 {
    data object Loading : State293_52()
    data class Success(val data: String) : State293_52()
    data class Error(val message: String) : State293_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}