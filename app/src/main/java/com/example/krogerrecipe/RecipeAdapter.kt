package com.example.krogerrecipe

import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class RecipeAdapter(private val mContext: Context, recipeDataList: List<RecipeData>) :
    RecyclerView.Adapter<RecipeViewHolder>() {
    private val recipeDataList: List<RecipeData>
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val mView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_row_item, parent, false)
        return RecipeViewHolder(mView)
    }

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.mImage.setImageResource(recipeDataList[position].recipeImage)
        holder.mTitle.setText(recipeDataList[position].recipeName)
        holder.mDescription.setText(recipeDataList[position].recipeBriefDescription)
        holder.mPrice.setText(recipeDataList[position].recipeDifficulty)

        holder.mCardView.setOnClickListener(View.OnClickListener {
            var intent = Intent(mContext, RecipeDetailActivity::class.java)
            intent.putExtra("position", holder.adapterPosition)
            Log.d("abc", holder.adapterPosition.toString())
            mContext.startActivity(intent)
        })
    }

    override fun getItemCount(): Int {
        return recipeDataList.size
    }

    init {
        this.recipeDataList = recipeDataList
    }
}

class RecipeViewHolder(itemView: View) : ViewHolder(itemView) {
    var mImage: ImageView
    var mTitle: TextView
    var mDescription: TextView
    var mPrice: TextView
    var mCardView: CardView

    init {
        mImage = itemView.findViewById(R.id.recipeBriefImage)
        mTitle = itemView.findViewById(R.id.recipeBriefTitle)
        mDescription = itemView.findViewById(R.id.recipeBriefDescription)
        mPrice = itemView.findViewById(R.id.recipeBriefDifficulty)
        mCardView = itemView.findViewById(R.id.recipeBriefCardView)
    }
}