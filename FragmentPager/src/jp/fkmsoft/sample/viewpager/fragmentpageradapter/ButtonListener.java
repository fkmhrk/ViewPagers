package jp.fkmsoft.sample.viewpager.fragmentpageradapter;

import java.lang.ref.WeakReference;

import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;

public class ButtonListener implements OnClickListener {
    private WeakReference<FragmentActivity> activityRef;
    private int page;
    public ButtonListener(FragmentActivity activity) {
        activityRef = new WeakReference<FragmentActivity>(activity);
        page = 0;
    }
    @Override
    public void onClick(View v) {
        FragmentActivity activity = activityRef.get();
        if (activity == null) { return; }
        
        switch (v.getId()) {
        case R.id.button_add:
            addPage(activity);
            break;
        case R.id.button_remove:
            removePage(activity);
            break;
        }
        
    }
    private void addPage(FragmentActivity activity) {
        ViewPager viewPager = (ViewPager) activity.findViewById(R.id.viewpager);
        Adapter adapter = (Adapter) viewPager.getAdapter();
        
        adapter.add(PageFragment.newInstance(page));
        ++page;
        adapter.notifyDataSetChanged();
        
    }
    private void removePage(FragmentActivity activity) {
        ViewPager viewPager = (ViewPager) activity.findViewById(R.id.viewpager);
        Adapter adapter = (Adapter) viewPager.getAdapter();
        // get count
        int count = adapter.getCount();
        if (count == 0) { return; }
        // remove last one
        adapter.remove(count - 1); 
        adapter.notifyDataSetChanged();
    }
    
    
    
}
