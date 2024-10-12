package com.example.baitaptulam20;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.example.baitaptulam20.databinding.FragmentProfileBinding;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class ProfileFragment extends Fragment {
    FragmentProfileBinding binding;
    ProfileView viewPageAdapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentProfileBinding.inflate(inflater, container, false);

        viewPageAdapter = new ProfileView(requireActivity(), 2);
        binding.viewpage.setAdapter(viewPageAdapter);

        new TabLayoutMediator(binding.tabLayout, binding.viewpage,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText("Tab 1");
                            break;
                        case 1:
                            tab.setText("Tab 2");
                            break;
                    }
                }).attach();
        setTabDividers();
        return binding.getRoot();
    }
    private void setTabDividers() {
        View root = binding.tabLayout.getChildAt(0);
        if (root instanceof LinearLayout) {
            ((LinearLayout) root).setShowDividers(LinearLayout.SHOW_DIVIDER_MIDDLE);
            GradientDrawable drawable = new GradientDrawable();
            drawable.setColor(Color.WHITE);
            drawable.setSize(30, 1);
            ((LinearLayout) root).setDividerPadding(20);
            ((LinearLayout) root).setDividerDrawable(drawable);
        }
    }


}