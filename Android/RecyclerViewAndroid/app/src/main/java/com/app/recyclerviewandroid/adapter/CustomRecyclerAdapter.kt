package com.app.recyclerviewandroid.adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.MenuInflater
import android.view.View
import android.view.ViewGroup
import android.widget.PopupMenu
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.app.recyclerviewandroid.DetailActivity
import com.app.recyclerviewandroid.R
import com.app.recyclerviewandroid.databinding.ItemCardLayoutBinding
import com.app.recyclerviewandroid.databinding.ItemCardLayoutGridBinding
import com.app.recyclerviewandroid.model.User

class CustomRecyclerAdapter(var activity: Activity, var itemList: MutableList<User>) :
    RecyclerView.Adapter<CustomRecyclerAdapter.MyViewHolder>() {

    lateinit var binding: ItemCardLayoutBinding
    lateinit var listener: OnClickListener
    lateinit var menuListener: MenuItemClickListener


    interface OnClickListener {
        fun onItemClicked(user: User, position: Int)
    }

    interface MenuItemClickListener {
        fun onRemoveItem(user: User, position: Int, view: View)
        fun onEditItem(user: User, position: Int, view: View)
        fun onCancel()
    }

    fun setOnItemClickListener(listener: OnClickListener) {
        this.listener = listener
    }

    fun setOnMenuItemClickListener(listener: MenuItemClickListener) {
        this.menuListener = listener
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = ItemCardLayoutBinding.inflate(LayoutInflater.from(activity), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        var user = itemList[position]

        holder.bind.tvName.text = user.name
        holder.bind.tvEmail.text = user.email
        holder.bind.ivProfile.setImageResource(user.imageId)

        holder.bind.ivMenu.setOnClickListener {
            showPopupMenu(user, position, it)
        }

        holder.bind.parent.setOnClickListener {

            listener.onItemClicked(user, position)

            /*var intent = Intent(activity, DetailActivity::class.java)
            intent.putExtra("USER", user)
            activity.startActivity(intent)*/
            //Toast.makeText(activity, "${user.name}", Toast.LENGTH_SHORT).show()
        }


    }

    private fun showPopupMenu(user: User, position: Int, view: View) {
        var popupMenu = PopupMenu(activity, view)

        val inflater: MenuInflater = popupMenu.menuInflater
        inflater.inflate(R.menu.item_action, popupMenu.menu)
        popupMenu.show()

        popupMenu.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.action_remove -> {
                    menuListener.onRemoveItem(user, position, view)
                    true
                }
                R.id.action_edit -> {
                    menuListener.onEditItem(user, position, view)
                    true
                }
                R.id.action_cancel -> {
                    menuListener.onCancel()
                    true
                }
                else -> false

            }
        }

    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    class MyViewHolder(itemView: ItemCardLayoutBinding) : RecyclerView.ViewHolder(itemView.root) {
        var bind = itemView
    }


}