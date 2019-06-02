package com.coors.coorspos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.coors.coorspos.R
import kotlinx.android.synthetic.main.row_item_main_func.view.*

class MainFuncAdapter(val titleList: List<String>) : RecyclerView.Adapter<MainFuncAdapter.MainFuncViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainFuncViewholder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_item_main_func, parent, false)
        return MainFuncViewholder(view)
    }

    override fun getItemCount(): Int {
        return titleList.size
    }

    override fun onBindViewHolder(holder: MainFuncViewholder, position: Int) {
        val data = titleList.get(position)
        holder.bindData(data)
    }


    inner class MainFuncViewholder(view: View) : RecyclerView.ViewHolder(view) {
        val funcNameTv = view.tv_func_name

        fun bindData(title: String) {
            funcNameTv.text = title
        }
    }
}