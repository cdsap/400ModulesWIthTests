package com.awesomeapp.module_3_307

sealed class State307_88 {
    data object Loading : State307_88()
    data class Success(val data: String) : State307_88()
    data class Error(val message: String) : State307_88()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}