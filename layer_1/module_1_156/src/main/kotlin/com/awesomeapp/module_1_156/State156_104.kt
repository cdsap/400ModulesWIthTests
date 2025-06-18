package com.awesomeapp.module_1_156

sealed class State156_104 {
    data object Loading : State156_104()
    data class Success(val data: String) : State156_104()
    data class Error(val message: String) : State156_104()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}