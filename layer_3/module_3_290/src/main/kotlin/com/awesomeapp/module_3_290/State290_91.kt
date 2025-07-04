package com.awesomeapp.module_3_290

sealed class State290_91 {
    data object Loading : State290_91()
    data class Success(val data: String) : State290_91()
    data class Error(val message: String) : State290_91()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}