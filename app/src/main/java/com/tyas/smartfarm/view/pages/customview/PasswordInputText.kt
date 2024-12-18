package com.tyas.smartfarm.view.pages.customview

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import com.google.android.material.textfield.TextInputEditText
import com.tyas.smartfarm.R

class PasswordInputText @JvmOverloads constructor (
   context: Context,
   attrs: AttributeSet?
) : TextInputEditText(context, attrs) {

   init {
      addTextChangedListener(object: TextWatcher {
         override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

         override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

         override fun afterTextChanged(s: Editable?) {
            validatePassword(s.toString())
         }
      })
   }

   private fun validatePassword(password: String) {
      error = if (password.length < 8) {
         context.getString(R.string.minimal_pw)
      } else {
         null
      }
   }
}