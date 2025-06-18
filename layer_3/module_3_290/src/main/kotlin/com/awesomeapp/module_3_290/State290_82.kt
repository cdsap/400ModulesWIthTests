package com.awesomeapp.module_3_290

sealed class State290_82 {
    data object Loading : State290_82()
    data class Success(val data: String) : State290_82()
    data class Error(val message: String) : State290_82()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}