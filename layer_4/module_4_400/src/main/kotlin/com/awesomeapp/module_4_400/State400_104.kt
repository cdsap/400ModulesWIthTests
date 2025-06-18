package com.awesomeapp.module_4_400

sealed class State400_104 {
    data object Loading : State400_104()
    data class Success(val data: String) : State400_104()
    data class Error(val message: String) : State400_104()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}