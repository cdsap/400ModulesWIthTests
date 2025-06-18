package com.awesomeapp.module_4_377

sealed class State377_127 {
    data object Loading : State377_127()
    data class Success(val data: String) : State377_127()
    data class Error(val message: String) : State377_127()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}