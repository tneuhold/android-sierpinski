package com.example.teresaneuhold.sierpinskitriangle

;

import android.graphics.{Canvas, Paint}
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity extends AppCompatActivity {

  //def getTriangleView(): SierpinskyTriangleView = findViewById(R.id.SierpinskyTriangleView).asInstanceOf[SierpinskyTriangleView]


  override def onCreate(savedInstanceState: Bundle): Unit = {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }
}



