package com.example.firstkotlineprojext

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Button
import android.widget.ImageButton
import android.widget.TextView

class MainActivity : ComponentActivity() {

    private  var currentImage=0;
    lateinit var image: ImageView;
    var places=arrayOf("Sylhet","Cox's Bazar","Old Dhaka","Sonargaon","Bandarban")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main);

        val prev = findViewById<ImageButton>(R.id.prev)
        val next = findViewById<ImageButton>(R.id.next)
        val place = findViewById<TextView>(R.id.textView3)

        next.setOnClickListener {
            var idCurentImage = "pic$currentImage"
            var idCurrentImageInt=this.resources.getIdentifier(idCurentImage,"id",packageName)
            image=findViewById(idCurrentImageInt)
            image.alpha=0f

            currentImage=(5+currentImage+1)%5
            var idImageToShowString="pic$currentImage"
            var idImageToShowInt=this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f
            place.text=places[currentImage]
        }

        prev.setOnClickListener {
            var idCurentImage = "pic$currentImage"
            var idCurrentImageInt=this.resources.getIdentifier(idCurentImage,"id",packageName)
            image=findViewById(idCurrentImageInt)
            image.alpha=0f

            currentImage=(5+currentImage-1)%5
            var idImageToShowString="pic$currentImage"
            var idImageToShowInt=this.resources.getIdentifier(idImageToShowString,"id",packageName)
            image=findViewById(idImageToShowInt)
            image.alpha=1f
            place.text=places[currentImage]
        }
    }
}
