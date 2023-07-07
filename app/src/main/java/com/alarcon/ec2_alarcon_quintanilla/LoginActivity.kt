package com.alarcon.ec2_alarcon_quintanilla

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import androidx.core.widget.addTextChangedListener
import com.alarcon.ec2_alarcon_quintanilla.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tilemail.editText?.addTextChangedListener { text ->
            binding.btnlogin.isEnabled = validateEmailPassword(
                text.toString(),
                binding.tilpassword.editText?.text.toString()
            )
        }
        binding.tilpassword.editText?.addTextChangedListener { text ->
            binding.btnlogin.isEnabled =
                validateEmailPassword(binding.tilemail.editText?.text.toString(), text.toString())
        }

        binding.btnlogin.setOnClickListener {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
    private fun validateEmailPassword(email:String, password:String): Boolean{
        val validateEmail = email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches()
        val validatePassword = password.length >= 6
        return validateEmail && validatePassword
    }
}