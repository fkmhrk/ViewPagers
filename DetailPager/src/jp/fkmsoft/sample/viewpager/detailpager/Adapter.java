package jp.fkmsoft.sample.viewpager.detailpager;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;

public class Adapter extends FragmentStatePagerAdapter {

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

//    @Override
//    public int getItemPosition(Object object) {
//        for (int i = 0 ; i < items.size() ; ++i) {
//            if (object.equals(items.get(i))) {
//                return i;
//            }
//        }
//        return PagerAdapter.POSITION_NONE;
//    }
    
    

}
