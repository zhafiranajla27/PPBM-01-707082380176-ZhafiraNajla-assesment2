package ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.assesment2.R
import com.example.assesment2.databinding.FragmentPhoneBinding

class PhoneFragment : AppCompatActivity(){

    private lateinit var binding : FragmentPhoneBinding
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = FragmentPhoneBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val  name = intent.getStringExtra("name")
    val  phone = intent.getStringExtra("phone")
    val  country = intent.getStringExtra("country")
    val  imageId = intent.getIntExtra("imageId",R.drawable.usericon)

    var nameProfile = findViewById<TextView>(R.id.personName)
    var profileImage = findViewById<ImageView>(R.id.profile_pic)
    var phoneProfile = findViewById<TextView>(R.id.phone_profile)
    var countryProfile = findViewById<TextView>(R.id.countryprofile)
   nameProfile.text = name
   phoneProfile.text = phone
    countryProfile.text = country
    profileImage. setImageResource(imageId)

  }
}