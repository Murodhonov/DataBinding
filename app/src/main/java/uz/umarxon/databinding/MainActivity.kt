package uz.umarxon.databinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import uz.umarxon.databinding.databinding.ActivityMainBinding
import uz.umarxon.databinding.models.User

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        val user = User("Murodhonov","+998996027213")
        binding.user = user


    }
}