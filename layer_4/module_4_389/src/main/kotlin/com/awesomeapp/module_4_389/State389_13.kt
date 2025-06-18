package com.awesomeapp.module_4_389

sealed class State389_13 {
    data object Loading : State389_13()
    data class Success(val data: String) : State389_13()
    data class Error(val message: String) : State389_13()

    companion object {
        fun loading() = Loading
        fun success(data: String) = Success(data)
        fun error(message: String) = Error(message)
    }
}