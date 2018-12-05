/*
 * Copyright (c) 2017. Truiton (http://www.truiton.com/).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 * Mohit Gupt (https://github.com/mohitgupt)
 *
 */

package com.truiton.learnacademy;

import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class ItemThreeFragment extends Fragment implements View.OnClickListener {

    private final int LENGTH = 9;

    private int color_bisaya[]; // Bisaya
    private int color_english[]; // English
    private int color_tagalog[]; // Tagalog

    private MediaPlayer mediaplayer[]; // MediaPlayer
    private Button button[]; // Buttons

    public static ItemThreeFragment newInstance() {
        ItemThreeFragment fragment = new ItemThreeFragment();
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
        color_bisaya = new int[LENGTH];
        color_english = new int[LENGTH];
        color_tagalog = new int[LENGTH];
        button = new Button[LENGTH];
        new MyAsyncTask().execute();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_item_three, container, false);

        // Initialize
        button[0] = (Button) rootView.findViewById(R.id.color_black);
        button[1] = (Button) rootView.findViewById(R.id.color_pink);
        button[2] = (Button) rootView.findViewById(R.id.color_gray);
        button[3] = (Button) rootView.findViewById(R.id.color_blue);
        button[4] = (Button) rootView.findViewById(R.id.color_green);
        button[5] = (Button) rootView.findViewById(R.id.color_yellow);
        button[6] = (Button) rootView.findViewById(R.id.color_brown);
        button[7] = (Button) rootView.findViewById(R.id.color_red);
        button[8] = (Button) rootView.findViewById(R.id.color_white);

        // onClick listener
        for(int x=0 ; x<button.length ; x++){ button[x].setOnClickListener(this); }

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.color_black:  color(0);   break;
            case R.id.color_pink:   color(1);   break;
            case R.id.color_gray:   color(2);   break;
            case R.id.color_blue:   color(3);   break;
            case R.id.color_green:  color(4);   break;
            case R.id.color_yellow: color(5);   break;
            case R.id.color_brown:  color(6);   break;
            case R.id.color_red:    color(7);   break;
            case R.id.color_white:  color(8);   break;
        }
    }

    // Color
    private void color(int index){
        release_media(mediaplayer);
        switch (EventStatus.app_status){
            case EventStatus.option1_status: mediaplayer[index] = MediaPlayer.create(getActivity(), color_bisaya[index]); break;
            case EventStatus.option2_status: mediaplayer[index] = MediaPlayer.create(getActivity(), color_english[index]); break;
            case EventStatus.option3_status: mediaplayer[index] = MediaPlayer.create(getActivity(), color_tagalog[index]); break;
        }
        mediaplayer[index].start();
    }

    // Initialize Bisaya
    private void init_bisaya(){
        color_bisaya[0] = R.raw.color_bisaya1_itom;
        color_bisaya[1] = R.raw.color_bisaya2_rosas;
        color_bisaya[2] = R.raw.color_bisaya3_abo;
        color_bisaya[3] = R.raw.color_bisaya4_anil;
        color_bisaya[4] = R.raw.color_bisaya5_lunhaw;
        color_bisaya[5] = R.raw.color_bisaya6_dalag;
        color_bisaya[6] = R.raw.color_bisaya7_tabonon;
        color_bisaya[7] = R.raw.color_bisaya8_pula;
        color_bisaya[8] = R.raw.color_bisaya9_puti;
    }

    // Initialize English
    private void init_english(){
        color_english[0] = R.raw.color_english1_black;
        color_english[1] = R.raw.color_english2_pink;
        color_english[2] = R.raw.color_english3_gray;
        color_english[3] = R.raw.color_english4_blue;
        color_english[4] = R.raw.color_english5_green;
        color_english[5] = R.raw.color_english6_yellow;
        color_english[6] = R.raw.color_english7_brown;
        color_english[7] = R.raw.color_english8_red;
        color_english[8] = R.raw.color_english9_white;
    }

    // Initialize Tagalog
    private void init_tagalog(){
        color_tagalog[0] = R.raw.color_tagalog1_itim;
        color_tagalog[1] = R.raw.color_tagalog2_rosas;
        color_tagalog[2] = R.raw.color_tagalog3_abo;
        color_tagalog[3] = R.raw.color_tagalog4_asul;
        color_tagalog[4] = R.raw.color_tagalog5_berde;
        color_tagalog[5] = R.raw.color_tagalog6_dilaw;
        color_tagalog[6] = R.raw.color_tagalog7_kayumangi;
        color_tagalog[7] = R.raw.color_tagalog8_pula;
        color_tagalog[8] = R.raw.color_tagalog9_puti;
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
