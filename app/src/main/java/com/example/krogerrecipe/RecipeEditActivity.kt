package com.example.krogerrecipe

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_recipe_detail.*
import kotlinx.android.synthetic.main.activity_recipe_edit.*

class RecipeEditActivity : AppCompatActivity() {
    private lateinit var recipeDescription: EditText
    private lateinit var recipeImage: ImageView
    private var pos = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recipe_edit)

        recipeDescription = recipeEditDescription
        recipeImage = recipeEditImage

        var mBundle : Bundle? = intent.extras

        if (mBundle != null){
            pos = mBundle.getInt("position")
            recipeImage.setImageResource(AllRecipes.list[pos].recipeImage)
            recipeEditTitle.text = AllRecipes.list[pos].recipeName
            recipeDescription.setText(AllRecipes.list[pos].recipeDetailDescription)
        }

        recipeDescription.setMovementMethod(ScrollingMovementMethod())
    }

    fun finishEditDescription(view: View) {
        AllRecipes.list[pos].recipeDetailDescription = recipeDescription.text.toString()
        finish();
    }

    fun cancelEditDescription(view: View) {
        finish();
    }
}