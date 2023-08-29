package com.example.msg_assignment.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.example.msg_assignment.R
import com.example.msg_assignment.adapters.PostListAdapter
import com.example.msg_assignment.databinding.ActivityPostListBinding
import com.example.msg_assignment.viewmodel.PostListViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class PostListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPostListBinding
    private val viewModel by viewModels<PostListViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPostListBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}