package jp.fkmsoft.sample.viewpager.detailpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class PageFragment extends Fragment {
    private static final String ARGS_PAGE = "page";

    public static PageFragment newInstance(int page) {
        PageFragment fragment = new PageFragment();
        
        Bundle args = new Bundle();
        args.putInt(ARGS_PAGE, page);
        fragment.setArguments(args);
        
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        Button button = new Button(inflater.getContext());
        button.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 32);
        
        // get args
        Bundle args = getArguments();
        final int page = args.getInt(ARGS_PAGE);
        
        button.setText("Page:" + page);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.addToBackStack("");
                
                Fragment next = DetailFragment.newInstance(page);
                transaction.replace(android.R.id.content, next);
                
                transaction.commit();
            }
        });
        
        return button;
    }
    
    
}
