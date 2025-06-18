package com.awesomeapp.module_2_224

sealed class State224_8 {
    data object Loading : State224_8()
    data class Success(val data: String) : State224_8()
    data class Error(val message: String) : State224_8()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}