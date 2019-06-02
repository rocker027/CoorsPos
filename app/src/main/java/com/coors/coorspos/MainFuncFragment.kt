package com.coors.coorspos

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import com.coors.coorspos.adapter.MainFuncAdapter
import com.coors.coorspos.viewmodel.MainFuncViewModel
import kotlinx.android.synthetic.main.main_func_fragment.*


class MainFuncFragment : Fragment() {

    companion object {
        fun newInstance() = MainFuncFragment()
    }

    private lateinit var viewModel: MainFuncViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.main_func_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainFuncViewModel::class.java)

        recyclerview.layoutManager = GridLayoutManager(this.context, 3, GridLayoutManager.HORIZONTAL, false)
        recyclerview.setHasFixedSize(true)
        val list = listOf("fun1", "fun1", "fun1", "fun1", "fun1", "fun1", "fun1", "fun1", "fun1")
        val adapter = MainFuncAdapter(list)
        recyclerview.adapter = adapter
    }

}
