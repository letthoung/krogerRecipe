package com.example.krogerrecipe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var mRecyclerView: RecyclerView
    private lateinit var gridLayoutManager: GridLayoutManager
    private lateinit var adapter: RecipeAdapter
    private lateinit var toggle: ActionBarDrawerToggle
    private lateinit var mRecipeList: ArrayList<RecipeData>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRecyclerView = allRecipesRecyclerView
        gridLayoutManager = GridLayoutManager(this, 1)
        mRecyclerView.layoutManager = gridLayoutManager;

        mRecipeList = AllRecipes.list;

        adapter = RecipeAdapter(this, mRecipeList)
        mRecyclerView.setAdapter(adapter);

        toggle = ActionBarDrawerToggle(this, mainDrawerLayout, R.string.open, R.string.close)
        mainDrawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        var aboutIntent = Intent(this, AboutActivity::class.java)

        mainNavView.setNavigationItemSelectedListener {
            when(it.itemId) {
                R.id.menuItemAbout -> startActivity(aboutIntent)
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
}