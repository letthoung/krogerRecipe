package com.example.krogerrecipe

import android.content.Intent
import android.content.res.Configuration
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.widget.ProgressBar
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {
    private lateinit var recipesRecyclerView: RecyclerView
    private lateinit var layoutManager: LinearLayoutManager
    private lateinit var adapter: RecipeAdapter
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var recipeList: ArrayList<RecipeData>
    private lateinit var loadingIndicator: ProgressBar

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // initialize UI elements
        loadingIndicator = recipesLoadingIndicator
        recipesRecyclerView = allRecipesRecyclerView

        // mimic the fetching data behavior
        startLoading()
        Timer().schedule(4000) {
            runOnUiThread {
                finishLoading()
            }
        }

        // set up layout manager for recycler view of recipes
        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            // In portrait
            layoutManager = LinearLayoutManager(this)
            recipesRecyclerView.layoutManager = layoutManager;
        } else {
            // In landscape
            layoutManager = GridLayoutManager(this,2)
            recipesRecyclerView.layoutManager = layoutManager;
        }

        // set up action bar
        toggle = ActionBarDrawerToggle(this, mainDrawerLayout, R.string.open, R.string.close)
        mainDrawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        // enable up button
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        // set up listeners for options in navigation drawer
        mainNavView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.menuItemAbout -> startActivity(Intent(this, AboutActivity::class.java))
                R.id.menuRecipes -> startActivity(Intent(this, MainActivity::class.java))
            }
            true
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item)
    }

    fun startLoading(){
        // fetch recipe data list
        recipeList = AllRecipes.list;

        // set adapter
        adapter = RecipeAdapter(this, recipeList)
        recipesRecyclerView.setAdapter(adapter);

        loadingIndicator.visibility = View.VISIBLE
        recipesRecyclerView.visibility = View.INVISIBLE
    }

    fun finishLoading(){
        loadingIndicator.visibility = View.GONE
        recipesRecyclerView.visibility = View.VISIBLE
    }
}