package com.awesomeapp.module_0_55

sealed class State55_103 {
    data object Loading : State55_103()
    data class Success(val data: String) : State55_103()
    data class Error(val message: String) : State55_103()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}