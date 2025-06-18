package com.awesomeapp.module_4_377

sealed class State377_19 {
    data object Loading : State377_19()
    data class Success(val data: String) : State377_19()
    data class Error(val message: String) : State377_19()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}