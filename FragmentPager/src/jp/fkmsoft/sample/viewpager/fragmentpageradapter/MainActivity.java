package jp.fkmsoft.sample.viewpager.fragmentpageradapter;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.View;

public class MainActivity extends FragmentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        // set adapter
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        Adapter adapter = new Adapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        
        setButtonListener();
    }

    private void setButtonListener() {
        ButtonListener listener = new ButtonListener(this);
        int[] ids = {R.id.button_add, R.id.button_remove};
        for (int id : ids) {
            View button = findViewById(id);
            button.setOnClickListener(listener);
        }
        
    }
}
