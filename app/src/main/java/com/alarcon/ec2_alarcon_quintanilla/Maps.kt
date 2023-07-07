package com.alarcon.ec2_alarcon_quintanilla

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.alarcon.ec2_alarcon_quintanilla.databinding.FragmentMapsBinding

class Maps : Fragment() {
    private lateinit var binding: FragmentMapsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentMapsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnUbi1.setOnClickListener {
            val map1 = Uri.parse("geo:0,0?q=-12.208370,-76.923884(Casa)")
            val intent = Intent(Intent.ACTION_VIEW, map1)
            intent.setPackage("com.google.android.apps.maps")
            intent.resolveActivity(requireActivity().packageManager)?.let {
                startActivity(intent)
            }
        }

        binding.btnUbi2.setOnClickListener {
            val map2 = Uri.parse("geo:0,0?q=-12.203760210385818, -76.92815077837012(Tottus - Pachacutec )")
            val intent = Intent(Intent.ACTION_VIEW, map2)
            intent.setPackage("com.google.android.apps.maps")
            intent.resolveActivity(requireActivity().packageManager)?.let {
                startActivity(intent)
            }
        }

        binding.btnUbi3.setOnClickListener {
            val map3 = Uri.parse("geo:0,0?q=-12.16090251969126, -76.95832066310999(Hospital Maria Auxiliadora)")
            val intent = Intent(Intent.ACTION_VIEW, map3)
            intent.setPackage("com.google.android.apps.maps")
            intent.resolveActivity(requireActivity().packageManager)?.let {
                startActivity(intent)
            }
        }
    }
}