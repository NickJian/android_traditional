package com.example.traditionalandroidproject.ui.home

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class HomeViewModel : ViewModel() {

	private val _textFlow = MutableStateFlow("Intial Text")
	val textStateFlow: StateFlow<String> = _textFlow
}