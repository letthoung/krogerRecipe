package com.example.krogerrecipe

import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recipe_detail.*


class RecipeDetailActivity : AppCompatActivity() {
    private lateinit var recipeDescription: TextView
    private lateinit var recipeImage: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_detail)

        val actionBar = supportActionBar
        actionBar!!.title = "Recipe Detail"
        actionBar.setDisplayHomeAsUpEnabled(true)

        recipeDescription = recipeDetailDescription
        recipeImage = recipeDetailImage

        var mBundle : Bundle? = intent.extras

        if (mBundle != null){
            recipeImage.setImageResource(mBundle.getInt("image"))
            recipeDetailTitle.text = mBundle.getString("name")
            recipeDescription.text = mBundle.getString("description")
        }
        recipeDescription.setMovementMethod(ScrollingMovementMethod())
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}