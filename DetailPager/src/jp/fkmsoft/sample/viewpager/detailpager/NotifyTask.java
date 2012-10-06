package jp.fkmsoft.sample.viewpager.detailpager;

import android.os.AsyncTask;
import android.support.v4.view.PagerAdapter;

public class NotifyTask extends AsyncTask<Void, Void, Void> {

    private PagerAdapter adapter;
    public NotifyTask(PagerAdapter adapter) {
        this.adapter = adapter;
    }
    @Override
    protected Void doInBackground(Void... params) {
        return null;
    }
    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);
        
        adapter.notifyDataSetChanged();
    }
    

}
