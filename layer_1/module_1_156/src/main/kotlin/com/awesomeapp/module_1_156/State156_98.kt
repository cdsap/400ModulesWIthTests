package com.awesomeapp.module_1_156

sealed class State156_98 {
    data object Loading : State156_98()
    data class Success(val data: String) : State156_98()
    data class Error(val message: String) : State156_98()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}