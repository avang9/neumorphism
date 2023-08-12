package id.avang.tesla

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import id.avang.tesla.databinding.ActivityMain2Binding
import soup.neumorphism.NeumorphImageView
import soup.neumorphism.ShapeType

class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnBattery.setOnClickListener {

            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.btnDry.setShapeType(ShapeType.FLAT)
                binding.btnRange.setShapeType(ShapeType.FLAT)
                binding.btnProgram.setShapeType(ShapeType.FLAT)

                binding.btnDry.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnRange.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnProgram.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            }

        }
        binding.btnDry.setOnClickListener {

            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.btnBattery.setShapeType(ShapeType.FLAT)
                binding.btnRange.setShapeType(ShapeType.FLAT)
                binding.btnProgram.setShapeType(ShapeType.FLAT)

                binding.btnDry.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnRange.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnProgram.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            }

        }
        binding.btnRange.setOnClickListener {

            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.btnDry.setShapeType(ShapeType.FLAT)
                binding.btnRange.setShapeType(ShapeType.FLAT)
                binding.btnProgram.setShapeType(ShapeType.FLAT)

                binding.btnDry.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnBattery.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnProgram.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            }

        }
        binding.btnProgram.setOnClickListener {

            val shapeType = (it as NeumorphImageView).getShapeType()
            if (shapeType == ShapeType.PRESSED) {

                it.setShapeType(ShapeType.FLAT)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            } else {

                it.setShapeType(ShapeType.PRESSED)
                it.setColorFilter(
                    ContextCompat.getColor(this, R.color.blue_light),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

                binding.btnDry.setShapeType(ShapeType.FLAT)
                binding.btnRange.setShapeType(ShapeType.FLAT)
                binding.btnProgram.setShapeType(ShapeType.FLAT)

                binding.btnDry.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnRange.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )
                binding.btnBattery.setColorFilter(
                    ContextCompat.getColor(this, R.color.icon_default_color),
                    android.graphics.PorterDuff.Mode.SRC_IN
                )

            }

        }

    }
}