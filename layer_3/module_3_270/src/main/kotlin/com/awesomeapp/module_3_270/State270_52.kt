package com.awesomeapp.module_3_270

sealed class State270_52 {
    data object Loading : State270_52()
    data class Success(val data: String) : State270_52()
    data class Error(val message: String) : State270_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}