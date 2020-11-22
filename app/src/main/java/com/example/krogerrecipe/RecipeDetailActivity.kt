package com.example.krogerrecipe

import android.content.Intent
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_recipe_detail.*


class RecipeDetailActivity : AppCompatActivity() {
    private lateinit var recipeDescription: TextView
    private lateinit var recipeImage: ImageView
    private var pos: Int = 0

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
            pos = mBundle.getInt("position")
            recipeImage.setImageResource(AllRecipes.list[pos].recipeImage)
            recipeDetailTitle.text = AllRecipes.list[pos].recipeName
            recipeDescription.text = AllRecipes.list[pos].recipeDetailDescription
        }
        recipeDescription.setMovementMethod(ScrollingMovementMethod())
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onResume() {
        super.onResume()
        recipeDescription.setText(AllRecipes.list[pos].recipeDetailDescription)
    }

    fun editRecipeDescription(view: View) {
        var intent = Intent(this, RecipeEditActivity::class.java)
        intent.putExtra("position", pos)
        startActivity(intent)
    }
}