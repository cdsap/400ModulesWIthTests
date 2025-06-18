package com.awesomeapp.module_2_200

sealed class State200_77 {
    data object Loading : State200_77()
    data class Success(val data: String) : State200_77()
    data class Error(val message: String) : State200_77()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}