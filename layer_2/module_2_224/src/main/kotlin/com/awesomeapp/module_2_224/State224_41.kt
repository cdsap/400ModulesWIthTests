package com.awesomeapp.module_2_224

sealed class State224_41 {
    data object Loading : State224_41()
    data class Success(val data: String) : State224_41()
    data class Error(val message: String) : State224_41()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}