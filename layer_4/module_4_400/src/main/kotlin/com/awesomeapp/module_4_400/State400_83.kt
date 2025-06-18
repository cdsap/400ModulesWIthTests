package com.awesomeapp.module_4_400

sealed class State400_83 {
    data object Loading : State400_83()
    data class Success(val data: String) : State400_83()
    data class Error(val message: String) : State400_83()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}