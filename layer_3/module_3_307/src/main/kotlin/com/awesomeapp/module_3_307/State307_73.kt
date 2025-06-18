package com.awesomeapp.module_3_307

sealed class State307_73 {
    data object Loading : State307_73()
    data class Success(val data: String) : State307_73()
    data class Error(val message: String) : State307_73()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}