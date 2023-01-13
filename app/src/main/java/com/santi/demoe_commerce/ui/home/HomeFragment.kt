package com.santi.demoe_commerce.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.santi.demoe_commerce.MainActivity
import com.santi.demoe_commerce.R
import com.santi.demoe_commerce.adapter.CategoryAdapter
import com.santi.demoe_commerce.adapter.ProductAdapter
import com.santi.demoe_commerce.databinding.FragmentHomeBinding
import com.santi.demoe_commerce.model.CategoryModel
import com.santi.demoe_commerce.model.ProductModel

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!

    private var categoryAdapter: CategoryAdapter? = null
    private val categoryList = arrayListOf<CategoryModel>()

    private var productAdapter: ProductAdapter? = null
    private val productList = arrayListOf<ProductModel>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel = ViewModelProvider(this)[HomeViewModel::class.java]
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        initView()
        bindData(homeViewModel)

        return root
    }

    override fun onResume() {
        super.onResume()
        (activity as MainActivity).showNav(true)
    }

    private fun initView() {
        categoryAdapter = CategoryAdapter(categoryList) {
            findNavController().navigate(R.id.navigation_product_list)
        }
        binding.recyclerCategory.adapter = categoryAdapter

        productAdapter = ProductAdapter(productList) {
            val bundle = Bundle()
            bundle.putString("IMAGE", it.image)
            bundle.putString("TITLE", it.title)
            bundle.putString("PRICE", it.price)
            findNavController().navigate(R.id.navigation_product_detail, bundle)
        }
        binding.recyclerProduct.adapter = productAdapter
    }

    private fun bindData(viewModel: HomeViewModel) {
        viewModel.imageList.observe(viewLifecycleOwner) {
            binding.imageSlider.apply {
                setImageList(it)
                startSliding()
            }
        }

        viewModel.categoryList.observe(viewLifecycleOwner) {
            categoryList.clear()
            categoryList.addAll(it)
            categoryAdapter?.notifyDataSetChanged()
        }

        viewModel.productList.observe(viewLifecycleOwner) {
            productList.clear()
            productList.addAll(it)
            productAdapter?.notifyDataSetChanged()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}