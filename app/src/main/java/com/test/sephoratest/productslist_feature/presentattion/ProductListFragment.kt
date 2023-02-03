package com.test.sephoratest.productslist_feature.presentattion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.test.sephoratest.R
import com.test.sephoratest.databinding.FragmentProductListBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class ProductListFragment : Fragment() {

    private lateinit var productListBinding: FragmentProductListBinding



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        productListBinding = DataBindingUtil.inflate<FragmentProductListBinding?>(
            inflater, R.layout.fragment_product_list, container, false
        ).apply {
            lifecycleOwner = viewLifecycleOwner
        }

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}