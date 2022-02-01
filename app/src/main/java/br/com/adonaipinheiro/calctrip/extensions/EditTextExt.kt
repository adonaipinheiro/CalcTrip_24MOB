package br.com.adonaipinheiro.calctrip.extensions

import android.widget.EditText

fun EditText.valueDouble() = this.text.toString().toDouble()