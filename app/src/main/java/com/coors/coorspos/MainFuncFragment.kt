package com.coors.coorspos

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.coors.coorspos.viewmodel.MainFuncViewModel


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
        // TODO: Use the ViewModel
    }

}
