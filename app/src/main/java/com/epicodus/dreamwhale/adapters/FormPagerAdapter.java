package com.epicodus.dreamwhale.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.epicodus.dreamwhale.ui.ColorPickerFragment;
import com.epicodus.dreamwhale.ui.DatePickerFragment;
import com.epicodus.dreamwhale.ui.DreamDescriptionFragment;

/**
 * Created by Guest on 5/11/16.
 */
public class FormPagerAdapter extends FragmentPagerAdapter {


        private static int NUM_ITEMS = 3;

        public FormPagerAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        // Returns total number of pages
        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        // Returns the fragment to display for that page
        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0: // Fragment # 0 - This will show FirstFragment
                    return DatePickerFragment.newInstance(0, "Date");
                case 1: // Fragment # 0 - This will show FirstFragment different title
                    return ColorPickerFragment.newInstance(1, "Color");
                case 2: // Fragment # 1 - This will show SecondFragment
                    return DreamDescriptionFragment.newInstance(2, "Notes");
                default:
                    return null;
            }
        }

        // Returns the page title for the top indicator
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Date";
                case 1:
                    return "Color";
                case 2:
                    return "Notes";
                default:
                    return null;
            }

        }

}
