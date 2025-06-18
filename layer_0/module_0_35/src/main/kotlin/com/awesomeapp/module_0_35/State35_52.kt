package com.awesomeapp.module_0_35

sealed class State35_52 {
    data object Loading : State35_52()
    data class Success(val data: String) : State35_52()
    data class Error(val message: String) : State35_52()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}