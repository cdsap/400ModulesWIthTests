package com.awesomeapp.module_0_58

sealed class State58_73 {
    data object Loading : State58_73()
    data class Success(val data: String) : State58_73()
    data class Error(val message: String) : State58_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}