package com.truiton.learnacademy;

import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

public class ItemFourFragment extends Fragment implements View.OnClickListener {

    private final int LENGTH = 9;

    private int shape_bisaya[]; // Bisaya
    private int shape_english[]; // English
    private int shape_tagalog[]; // Tagalog

    private MediaPlayer mediaplayer[]; // MediaPlayer
    private ImageButton button[]; // Button

    public static ItemFourFragment newInstance() {
        ItemFourFragment fragment = new ItemFourFragment();
        return fragment;
    }

    // Release Media
    private void release_media(MediaPlayer media[]){
        for(int x=0 ; x<media.length ; x++){
            if(media[x] != null){
                media[x].release();
            }
        }
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        release_media(mediaplayer);
        mediaplayer = null;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mediaplayer = new MediaPlayer[LENGTH];
        shape_bisaya = new int[LENGTH];
        shape_english = new int[LENGTH];
        shape_tagalog = new int[LENGTH];
        button = new ImageButton[LENGTH];
        new MyAsyncTask().execute(); // Execute Loading
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_item_four, container, false);

        // Initialize
        button[0] = (ImageButton) rootView.findViewById(R.id.shape_1);
        button[1] = (ImageButton) rootView.findViewById(R.id.shape_2);
        button[2] = (ImageButton) rootView.findViewById(R.id.shape_3);
        button[3] = (ImageButton) rootView.findViewById(R.id.shape_4);
        button[4] = (ImageButton) rootView.findViewById(R.id.shape_5);
        button[5] = (ImageButton) rootView.findViewById(R.id.shape_6);
        button[6] = (ImageButton) rootView.findViewById(R.id.shape_7);
        button[7] = (ImageButton) rootView.findViewById(R.id.shape_8);
        button[8] = (ImageButton) rootView.findViewById(R.id.shape_9);

        // onClick listener
        for(int x=0 ; x<button.length ; x++){ button[x].setOnClickListener(this); }

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.shape_1: shape(0); break;
            case R.id.shape_2: shape(1); break;
            case R.id.shape_3: shape(2);  break;
            case R.id.shape_4: shape(3); break;
            case R.id.shape_5: shape(4); break;
            case R.id.shape_6: shape(5); break;
            case R.id.shape_7: shape(6); break;
            case R.id.shape_8: shape(7); break;
            case R.id.shape_9: shape(8); break;
        }
    }

    // Shape
    private void shape(int index){
        release_media(mediaplayer);
        switch (EventStatus.app_status){
            case EventStatus.option1_status: mediaplayer[index] = MediaPlayer.create(getActivity(), shape_bisaya[index]); break;
            case EventStatus.option2_status: mediaplayer[index] = MediaPlayer.create(getActivity(), shape_english[index]); break;
            case EventStatus.option3_status: mediaplayer[index] = MediaPlayer.create(getActivity(), shape_tagalog[index]); break;
        }
        mediaplayer[index].start();
    }

    // Initialize Bisaya
    private void init_bisaya(){
        shape_bisaya[0] = R.raw.shape_bisaya1_kwadrado;
        shape_bisaya[1] = R.raw.shape_bisaya2_trianggulo;
        shape_bisaya[2] = R.raw.shape_bisaya3_lingin;
        shape_bisaya[3] = R.raw.shape_bisaya4_rectanggulo;
        shape_bisaya[4] = R.raw.shape_bisaya5_dyamante;
        shape_bisaya[5] = R.raw.shape_bisaya6_bulan;
        shape_bisaya[6] = R.raw.shape_bisaya7_bitoon;
        shape_bisaya[7] = R.raw.shape_bisaya8_kasing2;
        shape_bisaya[8] = R.raw.shape_bisaya9_itlog;
    }

    // Initialize English
    private void init_english(){
        shape_english[0] = R.raw.shape_english1_square;
        shape_english[1] = R.raw.shape_english2_triangle;
        shape_english[2] = R.raw.shape_english3_circle;
        shape_english[3] = R.raw.shape_english4_rectngle;
        shape_english[4] = R.raw.shape_english5_diamond;
        shape_english[5] = R.raw.shape_english6_moon;
        shape_english[6] = R.raw.shape_english7_star;
        shape_english[7] = R.raw.shape_english8_heart;
        shape_english[8] = R.raw.shape_english9_oblong;
    }

    // Initialize Tagalog
    private void init_tagalog(){
        shape_tagalog[0] = R.raw.shape_tagalog1_parisukat;
        shape_tagalog[1] = R.raw.shape_tagalog2_tatsulok;
        shape_tagalog[2] = R.raw.shape_tagalog3_bilog;
        shape_tagalog[3] = R.raw.shape_tagalog4_parihaba;
        shape_tagalog[4] = R.raw.shape_tagalog5_diamante;
        shape_tagalog[5] = R.raw.shape_tagalog6_buwan;
        shape_tagalog[6] = R.raw.shape_tagalog7_tala;
        shape_tagalog[7] = R.raw.shape_tagalog8_puso;
        shape_tagalog[8] = R.raw.shape_tagalog9_itlog;
    }

    public class MyAsyncTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            // Here you can show progress bar or something on the similar lines.
            // Since you are in a UI thread here.
            super.onPreExecute();
        }
        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            // After completing execution of given task, control will return here.
            // Hence if you want to populate UI elements with fetched data, do it here.
        }
        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
            // You can track you progress update here
        }
        @Override
        protected Void doInBackground(Void... params) {
            // Here you are in the worker thread and you are not allowed to access UI thread from here.
            // Here you can perform network operations or any heavy operations you want.
            switch (EventStatus.app_status){
                case EventStatus.option1_status: init_bisaya(); break;
                case EventStatus.option2_status: init_english(); break;
                case EventStatus.option3_status: init_tagalog(); break;
            }
            return null;
        }
    }
}
