package jp.fkmsoft.sample.viewpager.detailpager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DetailFragment extends Fragment {
    private static final String ARGS_PAGE = "page";

    public static DetailFragment newInstance(int page) {
        DetailFragment fragment = new DetailFragment();
        
        Bundle args = new Bundle();
        args.putInt(ARGS_PAGE, page);
        fragment.setArguments(args);
        
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        TextView text = new TextView(inflater.getContext());
        text.setTextSize(TypedValue.COMPLEX_UNIT_DIP, 32);
        
        // get args
        Bundle args = getArguments();
        int page = args.getInt(ARGS_PAGE);
        
        text.setText("Page(Detail):" + page);

        return text;
    }
    
    
}
