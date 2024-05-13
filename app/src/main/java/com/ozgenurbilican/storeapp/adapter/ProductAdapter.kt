package com.ozgenurbilican.storeapp.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.ozgenurbilican.storeapp.R
import com.ozgenurbilican.storeapp.databinding.ProductStoreBinding
import com.ozgenurbilican.storeapp.model.Product
import com.ozgenurbilican.storeapp.util.downloadURL

class ProductAdapter(var productList: ArrayList<Product>):RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(var view: ProductStoreBinding):RecyclerView.ViewHolder(view.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ProductStoreBinding>(inflater, R.layout.product_store,parent,false)
        return  ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
        return productList.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.view.productTV.text = productList[position].title
        holder.view.priceTV.text = productList[position].price.toString()
        holder.view.productIV.downloadURL(productList[position].image)
    }
    @SuppressLint("NotifyDataSetChanged")
    fun updateList(newList: List<Product>) {
        productList =newList as ArrayList<Product>
        notifyDataSetChanged()

    }


}

