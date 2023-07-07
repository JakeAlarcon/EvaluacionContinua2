package com.alarcon.ec2_alarcon_quintanilla

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.alarcon.ec2_alarcon_quintanilla.databinding.FragmentCameraBinding
import com.alarcon.ec2_alarcon_quintanilla.databinding.FragmentInfoBinding

class Info : Fragment() {
    private lateinit var binding: FragmentInfoBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = FragmentInfoBinding.inflate(inflater,container,false)
        return inflater.inflate(R.layout.fragment_info, container, false)
    }


}