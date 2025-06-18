package com.awesomeapp.module_0_35

sealed class State35_55 {
    data object Loading : State35_55()
    data class Success(val data: String) : State35_55()
    data class Error(val message: String) : State35_55()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}