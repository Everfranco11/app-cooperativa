package com.py.aviadoresapp.ui.home

import android.os.Bundle
import android.view.*
import android.webkit.WebSettings
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.py.aviadoresapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        loadWebPage()

        return binding.root
    }

    private fun loadWebPage() {
        val settings: WebSettings = binding.webView.settings
        settings.javaScriptEnabled = true
        binding.webView.webViewClient = WebViewClient()
        binding.webView.loadUrl("https://www.cursos.gov.py/portada")
        binding.webView.setOnKeyListener(View.OnKeyListener { _, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_BACK && event.action == MotionEvent.ACTION_UP && binding.webView.canGoBack()) {
                binding.webView.goBack()
                return@OnKeyListener true
            }
            false
        })
    }
}