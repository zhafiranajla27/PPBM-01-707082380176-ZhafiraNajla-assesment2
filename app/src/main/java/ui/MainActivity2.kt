package ui

import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import com.example.assesment2.R
import com.example.assesment2.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private  lateinit var  userArrayList : ArrayList<User>
    override  fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intArrayOf(
            R.drawable.usericon, R.drawable.usericon, R.drawable.usericon, R.drawable.usericon,
            R.drawable.usericon, R.drawable.usericon, R.drawable.usericon, R.drawable.usericon,
            )

            val name = arrayOf(
                "Vienza","Naura","Michale","Zinaura","Stefan","Shizuka","Nadhifa","Bryan"
            )
            val lastMessage = arrayOf(
                "Haiii","Where we go?","Thank you","any weekend plans?","i'm in meeting","Gotta go","where??","okeyyy"
            )
            val lastmsgTime = arrayOf(
                "8:45 pm","9:00 am","7:34 pm", "6:32 am","5:76 am","5:00 am","7:34 pm","2:32 am","7:26 am"
            )
            val phoneNo = arrayOf(
                "0812884629","08215462849","0846892045","0894294022","081248539902","08213475939","081209374920"
            )
        val country = arrayOf(
            "United States","French","Germany","Thailand","Canada","Saudi Arabia","Singapore","Malaysia"
        )

        userArrayList = ArrayList()

        for( i in name.indices){

            val user = User(name[i],lastMessage[i],lastmsgTime[i],phoneNo[i],imageId[i],country[i])
            userArrayList.add(user)
        }

        var listview = findViewById<ListView>(R.id.listview)
        listview.isClickable = true
        listview.adapter = MyAdapter(this,userArrayList)
        listview.setOnItemClickListener { parent, view, position, id->

            val name = name[position]
            val phone = phoneNo[position]
            val country = country[position]
            val imageId = imageId[position]

            val i = Intent(this,PhoneFragment::class.java)
            i.putExtra("name",name)
            i.putExtra("phone",phone)
            i.putExtra("country",country)
            i.putExtra("imageId",imageId)
            startActivity(i)
        }
    }
}