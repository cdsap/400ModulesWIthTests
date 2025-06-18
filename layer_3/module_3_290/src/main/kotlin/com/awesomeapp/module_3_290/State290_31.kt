package com.awesomeapp.module_3_290

sealed class State290_31 {
    data object Loading : State290_31()
    data class Success(val data: String) : State290_31()
    data class Error(val message: String) : State290_31()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}