package com.example.baitaptulam20;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ProfileView extends FragmentStateAdapter {
    private int totalTabs;
    public ProfileView(@NonNull FragmentActivity fragmentActivity, int totalTabs) {
        super(fragmentActivity);
        this.totalTabs = totalTabs;
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new Tab1Fragment();
            case 1:
                return new Tab2Fragment();
            default:
                return new Tab1Fragment();
        }
    }

    @Override
    public int getItemCount() {
        return totalTabs;
    }
}
