package com.santi.demoe_commerce.ui.product

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.santi.demoe_commerce.MainActivity
import com.santi.demoe_commerce.R
import com.santi.demoe_commerce.adapter.ProductAdapter
import com.santi.demoe_commerce.databinding.FragmentProductListBinding
import com.santi.demoe_commerce.model.ProductModel

class ProductListFragment: Fragment() {

    private var _binding: FragmentProductListBinding? = null
    private val binding get() = _binding!!

    private var productAdapter: ProductAdapter? = null
    private val productList = arrayListOf<ProductModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel = ViewModelProvider(this)[ProductListViewModel::class.java]
        _binding = FragmentProductListBinding.inflate(inflater, container, false)

        initView()
        bindData(viewModel)

        return binding.root
    }

    private fun initView() {
        (activity as MainActivity).showNav(false)

        productAdapter = ProductAdapter(productList) {
            val bundle = Bundle()
            bundle.putString("IMAGE", it.image)
            bundle.putString("TITLE", it.title)
            bundle.putString("PRICE", it.price)
            findNavController().navigate(R.id.navigation_product_detail, bundle)
        }
        binding.recyclerProduct.adapter = productAdapter

        binding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }
    }

    private fun bindData(viewModel: ProductListViewModel) {
        viewModel.productList.observe(viewLifecycleOwner) {
            productList.clear()
            productList.addAll(it)
            productAdapter?.notifyDataSetChanged()
        }
    }
}