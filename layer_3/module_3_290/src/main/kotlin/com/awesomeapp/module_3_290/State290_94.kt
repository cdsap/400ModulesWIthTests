package com.awesomeapp.module_3_290

sealed class State290_94 {
    data object Loading : State290_94()
    data class Success(val data: String) : State290_94()
    data class Error(val message: String) : State290_94()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}