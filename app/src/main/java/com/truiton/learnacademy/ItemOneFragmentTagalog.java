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

public class ItemOneFragmentTagalog extends Fragment implements View.OnClickListener {

    private final int LENGTH = 20;

    private int alphabet_tagalog[]; // Tagalog
    private MediaPlayer mediaplayer[]; // MediaPlayer
    private Button button[]; // Button

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

    public static ItemOneFragmentTagalog newInstance() {
        ItemOneFragmentTagalog fragment = new ItemOneFragmentTagalog();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mediaplayer = new MediaPlayer[LENGTH];
        alphabet_tagalog = new int[LENGTH];
        button = new Button[LENGTH];
        new MyAsyncTask().execute(); // Execute Loading
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item_one_tagalog, container, false);

        // Initialize
        button[0] = (Button) rootView.findViewById(R.id.alphabet_tagalog1);
        button[1] = (Button) rootView.findViewById(R.id.alphabet_tagalog2);
        button[2] = (Button) rootView.findViewById(R.id.alphabet_tagalog3);
        button[3] = (Button) rootView.findViewById(R.id.alphabet_tagalog4);
        button[4] = (Button) rootView.findViewById(R.id.alphabet_tagalog5);
        button[5] = (Button) rootView.findViewById(R.id.alphabet_tagalog6);
        button[6] = (Button) rootView.findViewById(R.id.alphabet_tagalog7);
        button[7] = (Button) rootView.findViewById(R.id.alphabet_tagalog8);
        button[8] = (Button) rootView.findViewById(R.id.alphabet_tagalog9);
        button[9] = (Button) rootView.findViewById(R.id.alphabet_tagalog10);
        button[10] = (Button) rootView.findViewById(R.id.alphabet_tagalog11);
        button[11] = (Button) rootView.findViewById(R.id.alphabet_tagalog12);
        button[12] = (Button) rootView.findViewById(R.id.alphabet_tagalog13);
        button[13] = (Button) rootView.findViewById(R.id.alphabet_tagalog14);
        button[14] = (Button) rootView.findViewById(R.id.alphabet_tagalog15);
        button[15] = (Button) rootView.findViewById(R.id.alphabet_tagalog16);
        button[16] = (Button) rootView.findViewById(R.id.alphabet_tagalog17);
        button[17] = (Button) rootView.findViewById(R.id.alphabet_tagalog18);
        button[18] = (Button) rootView.findViewById(R.id.alphabet_tagalog19);
        button[19] = (Button) rootView.findViewById(R.id.alphabet_tagalog20);

        // onClick listener
        for(int x=0 ; x<button.length ; x++){ button[x].setOnClickListener(this); }

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.alphabet_tagalog1: alphabet(0); break;
            case R.id.alphabet_tagalog2: alphabet(1); break;
            case R.id.alphabet_tagalog3: alphabet(2); break;
            case R.id.alphabet_tagalog4: alphabet(3); break;
            case R.id.alphabet_tagalog5: alphabet(4); break;
            case R.id.alphabet_tagalog6: alphabet(5); break;
            case R.id.alphabet_tagalog7: alphabet(6); break;
            case R.id.alphabet_tagalog8: alphabet(7); break;
            case R.id.alphabet_tagalog9: alphabet(8); break;
            case R.id.alphabet_tagalog10: alphabet(9); break;

            case R.id.alphabet_tagalog11: alphabet(10); break;
            case R.id.alphabet_tagalog12: alphabet(11); break;
            case R.id.alphabet_tagalog13: alphabet(12); break;
            case R.id.alphabet_tagalog14: alphabet(13); break;
            case R.id.alphabet_tagalog15: alphabet(14); break;
            case R.id.alphabet_tagalog16: alphabet(15); break;
            case R.id.alphabet_tagalog17: alphabet(16); break;
            case R.id.alphabet_tagalog18: alphabet(17); break;
            case R.id.alphabet_tagalog19: alphabet(18); break;
            case R.id.alphabet_tagalog20: alphabet(19); break;
        }
    }

    // Alphabet
    private void alphabet(int index){
        release_media(mediaplayer);
        mediaplayer[index] = MediaPlayer.create(getActivity(), alphabet_tagalog[index]);
        mediaplayer[index].start();
    }

    // Initialize English
    private void init_tagalog(){
        alphabet_tagalog[0] = R.raw.alphabet_tagalog1_a;
        alphabet_tagalog[1] = R.raw.alphabet_tagalog2_b;
        alphabet_tagalog[2] = R.raw.alphabet_tagalog3_k;
        alphabet_tagalog[3] = R.raw.alphabet_tagalog4_d;
        alphabet_tagalog[4] = R.raw.alphabet_tagalog5_e;
        alphabet_tagalog[5] = R.raw.alphabet_tagalog6_g;
        alphabet_tagalog[6] = R.raw.alphabet_tagalog7_h;
        alphabet_tagalog[7] = R.raw.alphabet_tagalog8_i;
        alphabet_tagalog[8] = R.raw.alphabet_tagalog9_l;
        alphabet_tagalog[9] = R.raw.alphabet_tagalog10_m;

        alphabet_tagalog[10] = R.raw.alphabet_tagalog11_n;
        alphabet_tagalog[11] = R.raw.alphabet_tagalog12_ng;
        alphabet_tagalog[12] = R.raw.alphabet_tagalog13_o;
        alphabet_tagalog[13] = R.raw.alphabet_tagalog14_p;
        alphabet_tagalog[14] = R.raw.alphabet_tagalog15_r;
        alphabet_tagalog[15] = R.raw.alphabet_tagalog16_s;
        alphabet_tagalog[16] = R.raw.alphabet_tagalog17_t;
        alphabet_tagalog[17] = R.raw.alphabet_tagalog18_u;
        alphabet_tagalog[18] = R.raw.alphabet_tagalog19_w;
        alphabet_tagalog[19] = R.raw.alphabet_tagalog20_y;
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
            init_tagalog();
            return null;
        }
    }
}
