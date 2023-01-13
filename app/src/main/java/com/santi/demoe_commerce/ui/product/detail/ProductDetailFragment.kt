package com.santi.demoe_commerce.ui.product.detail

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.santi.demoe_commerce.MainActivity
import com.santi.demoe_commerce.R
import com.santi.demoe_commerce.databinding.FragmentProductDetailBinding
import com.santi.demoe_commerce.utils.loadImage


class ProductDetailFragment : Fragment() {

    private var _binding: FragmentProductDetailBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val viewModel = ViewModelProvider(this)[ProductDetailViewModel::class.java]
        _binding = FragmentProductDetailBinding.inflate(inflater, container, false)

        initView()
        bindData(viewModel)

        return binding.root
    }

    private fun initView() {
        (activity as MainActivity).showNav(false)

        binding.buttonBack.setOnClickListener {
            findNavController().popBackStack()
        }

        val image = arguments?.getString("IMAGE")
        val title = arguments?.getString("TITLE")
        val price = arguments?.getString("PRICE")
        context?.let { binding.imageDetail.loadImage(it, image.toString()) }
        binding.textTitle.text = title
        binding.textPrice.text = price

        binding.layoutContactUs.buttonContact.setOnClickListener {
            if (binding.layoutContactUs.contactContent.isVisible) {
                binding.layoutContactUs.textContact.visibility = View.GONE
                binding.layoutContactUs.contactContent.visibility = View.GONE
                binding.layoutContactUs.contactContent.startAnimation(
                    AnimationUtils.loadAnimation(
                        context,
                        R.anim.slide_out
                    )
                )
            } else {
                binding.layoutContactUs.textContact.visibility = View.VISIBLE
                binding.layoutContactUs.contactContent.visibility = View.VISIBLE
                binding.layoutContactUs.contactContent.startAnimation(
                    AnimationUtils.loadAnimation(
                        context,
                        R.anim.slide_in
                    )
                )
            }
        }

        binding.layoutContactUs.buttonPhone.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = Uri.parse("tel:0123456789")
            startActivity(intent)
        }

        binding.layoutContactUs.buttonFacebook.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100004245934368"))
            startActivity(browserIntent)
        }

        binding.layoutContactUs.buttonTelegram.setOnClickListener {
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("https://t.me/tradecoinundergroundchannel"))
            startActivity(browserIntent)
        }
    }

    private fun bindData(viewModel: ProductDetailViewModel) {
        viewModel.description.observe(viewLifecycleOwner) {
            binding.textDescription.text = it
        }
    }
}