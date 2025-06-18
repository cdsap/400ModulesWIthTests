package com.awesomeapp.module_0_35

sealed class State35_103 {
    data object Loading : State35_103()
    data class Success(val data: String) : State35_103()
    data class Error(val message: String) : State35_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}