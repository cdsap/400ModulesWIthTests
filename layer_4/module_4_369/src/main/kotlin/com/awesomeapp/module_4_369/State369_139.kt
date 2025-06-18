package com.awesomeapp.module_4_369

sealed class State369_139 {
    data object Loading : State369_139()
    data class Success(val data: String) : State369_139()
    data class Error(val message: String) : State369_139()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}