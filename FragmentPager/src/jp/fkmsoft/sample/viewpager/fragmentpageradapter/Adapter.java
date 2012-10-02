package jp.fkmsoft.sample.viewpager.fragmentpageradapter;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class Adapter extends FragmentPagerAdapter {

    private List<Fragment> items = new ArrayList<Fragment>();
    public Adapter(FragmentManager fm) {
        super(fm);
    }
    
    public void add(Fragment item) {
        items.add(item);
    }
    
    public void remove(int position) {
        items.remove(position);
    }

    @Override
    public Fragment getItem(int position) {
        return items.get(position);
    }

    @Override
    public int getCount() {
        return items.size();
    }

}
