package com.app.recyclerviewandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.app.recyclerviewandroid.adapter.CustomRecyclerAdapter
import com.app.recyclerviewandroid.databinding.ActivityMainBinding
import com.app.recyclerviewandroid.model.User

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private var itemList = mutableListOf<User>()
    private lateinit var adapter: CustomRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        prepareData()

        // pass data to adapter class using constructor
        adapter = CustomRecyclerAdapter(this, itemList)

        // Linear layout manager
        var layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        // GridLayoutManager
        //var layoutManager = GridLayoutManager(this, 2)

        // Staggered Grid Layout Manager
        //var layoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        binding.recyclerView.layoutManager = layoutManager
        // setData to recyclerview using set adapter
        binding.recyclerView.adapter = adapter

        adapter.setOnItemClickListener(object : CustomRecyclerAdapter.OnClickListener {

            override fun onItemClicked(user: User, position: Int) {
                var intent = Intent(applicationContext, DetailActivity::class.java)
                intent.putExtra("USER", user)
                startActivity(intent)
            }

        })

        adapter.setOnMenuItemClickListener(object:CustomRecyclerAdapter.MenuItemClickListener{
            override fun onRemoveItem(user: User, position: Int, view: View) {

            }

            override fun onEditItem(user: User, position: Int, view: View) {

            }

            override fun onCancel() {

            }

        })

    }

    private fun prepareData() {

        itemList.add(User(12, "Manshi", "manshi@gmail.com", R.drawable.image_1))
        itemList.add(User(1, "Hiren", "hiren@gmail.com", R.drawable.image_3))
        itemList.add(User(78, "Krishna", "krishna@gmail.com", R.drawable.image_2))
        itemList.add(User(16, "Minaz", "minaz@gmail.com", R.drawable.image_3))
        itemList.add(User(77, "Yashvi", "yashvi@gmail.com", R.drawable.image_1))
        itemList.add(User(198, "Chandan", "chandan@gmail.com", R.drawable.image_3))
        itemList.add(User(12, "Manshi", "manshi@gmail.com", R.drawable.image_1))
        itemList.add(
            User(
                1,
                "Hiren",
                "hiren@gmail.comggggggggggggggfffffffffffff",
                R.drawable.image_3
            )
        )
        itemList.add(User(78, "Krishna", "krishna@gmail.com", R.drawable.image_2))
        itemList.add(User(16, "Minaz", "minaz@gmail.com", R.drawable.image_3))
        itemList.add(User(77, "Yashvi", "yashvi@gmail.com", R.drawable.image_1))
        itemList.add(User(198, "Chandan", "chandan@gmail.com", R.drawable.image_3))
    }
}