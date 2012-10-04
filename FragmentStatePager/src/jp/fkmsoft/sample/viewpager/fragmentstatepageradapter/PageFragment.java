package jp.fkmsoft.sample.viewpager.fragmentstatepageradapter;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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
        TextView textView = new TextView(inflater.getContext());
        textView.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 32);
        
        // get args
        Bundle args = getArguments();
        int page = args.getInt(ARGS_PAGE);
        
        textView.setText("Page:" + page);
        
        return textView;
    }
    
    
}
