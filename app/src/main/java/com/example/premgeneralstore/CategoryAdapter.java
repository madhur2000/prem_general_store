package com.example.premgeneralstore;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private String[] tabTitles = {"Inner Wear", "Detergent", "Skin Care", "Hair Care", "Bath & Hygiene", "Dish Wash", "Oral Care", "Face Wash", "Grooming", "Fragrances & Deo", "Cleaners", "Baby Care", "Cosmetics"};

    public CategoryAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {

        switch (position){
            case 0:
                return new InnerwearFragment();
            case 1:
                return new DetergentFragment();
            case 2:
                return new SkinCareFragment();
            case 3:
                return new HairCareFragment();
            case 4:
                return new BathAndHygieneFragment();
            case 5:
                return new DishWashFragment();
            case 6:
                return new OralCareFragment();
            case 7:
                return new FaceWashFragment();
            case 8:
                return new GroomingFragment();
            case 9:
                return new FragrancesAndDeoFragment();
            case 10:
                return new CleanersFragment();
            case 11:
                return new BabyCareFragment();
            default:
                return new CosmeticsFragment();
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {

        return tabTitles[position];

    }

    @Override
    public int getCount() {
        return 13;
    }
}
