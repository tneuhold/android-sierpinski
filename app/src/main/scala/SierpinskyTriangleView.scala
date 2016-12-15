package com.example.teresaneuhold.sierpinskitriangle

;



/**
  * Created by Teresa Neuhold on 15.12.2016.
  */
import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.view.View
import android.graphics.Path.FillType



  class Point(val x: Float, val y: Float)

  class SierpinskyTriangleView(start: Point, len: Float, count: Int, canvas: Canvas, paint: Paint) {
        if (count != 0) {

              val pythagoras = Math.sqrt((len * len) - ((len / 2) * (len / 2))).toFloat
              val a = new Point(start.x, start.y)
              val b = new Point(start.x + len, start.y)
              val c = new Point(((b.x - a.x) / 2) + start.x, (start.y - pythagoras))

              val path = new Path()
              path.setFillType(Path.FillType.EVEN_ODD)
              path.moveTo(a.x, a.y)
              path.lineTo(b.x, b.y)
              path.moveTo(b.x, b.y)
              path.lineTo(c.x, c.y)
              path.moveTo(c.x, c.y)
              path.lineTo(a.x, a.y)
              path.close()

              canvas.drawPath(path, paint)


              new SierpinskyTriangleView(new Point(a.x, a.y), len / 2, count - 1, canvas, paint)
              new SierpinskyTriangleView(new Point(c.x, a.y), len / 2, count - 1, canvas, paint)
              new SierpinskyTriangleView(new Point((c.x - a.x) / 2 + a.x, (c.y - a.y) / 2 + a.y), len / 2, count - 1, canvas, paint)

        }
  }







