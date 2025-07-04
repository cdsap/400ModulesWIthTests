package com.awesomeapp.module_3_267

sealed class State267_73 {
    data object Loading : State267_73()
    data class Success(val data: String) : State267_73()
    data class Error(val message: String) : State267_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}