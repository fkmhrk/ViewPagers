package jp.fkmsoft.sample.viewpager.detailpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class MainFragment extends Fragment {

    public static MainFragment newInstance() {
        MainFragment fragment = new MainFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.activity_main, container, false);
        // set adapter
        ViewPager viewPager = (ViewPager) root.findViewById(R.id.viewpager);
        Adapter adapter = new Adapter(getFragmentManager());
        
        adapter.add(PageFragment.newInstance(1));
        adapter.add(PageFragment.newInstance(2));
        viewPager.setAdapter(adapter);
        
        return root;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        
        View root = getView();
        if (root == null) { return; }
        ViewPager viewPager = (ViewPager) root.findViewById(R.id.viewpager);
        PagerAdapter adapter = viewPager.getAdapter();
        
        adapter.notifyDataSetChanged();
//        new NotifyTask(adapter).execute();
    }
    
    
    
    
}
