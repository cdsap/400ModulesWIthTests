package com.awesomeapp.module_0_35

sealed class State35_145 {
    data object Loading : State35_145()
    data class Success(val data: String) : State35_145()
    data class Error(val message: String) : State35_145()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}