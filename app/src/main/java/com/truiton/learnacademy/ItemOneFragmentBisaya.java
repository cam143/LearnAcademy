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

public class ItemOneFragmentBisaya extends Fragment implements View.OnClickListener {

    private final int LENGTH = 20;

    private int alphabet_bisaya[]; // Bisaya
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

    public static ItemOneFragmentBisaya newInstance() {
        ItemOneFragmentBisaya fragment = new ItemOneFragmentBisaya();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mediaplayer = new MediaPlayer[LENGTH];
        alphabet_bisaya = new int[LENGTH];
        button = new Button[LENGTH];
        new MyAsyncTask().execute(); // Execute Loading
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item_one_bisaya, container, false);

        // Initialize
        button[0] = (Button) rootView.findViewById(R.id.alphabet_bisaya1);
        button[1] = (Button) rootView.findViewById(R.id.alphabet_bisaya2);
        button[2] = (Button) rootView.findViewById(R.id.alphabet_bisaya3);
        button[3] = (Button) rootView.findViewById(R.id.alphabet_bisaya4);
        button[4] = (Button) rootView.findViewById(R.id.alphabet_bisaya5);
        button[5] = (Button) rootView.findViewById(R.id.alphabet_bisaya6);
        button[6] = (Button) rootView.findViewById(R.id.alphabet_bisaya7);
        button[7] = (Button) rootView.findViewById(R.id.alphabet_bisaya8);
        button[8] = (Button) rootView.findViewById(R.id.alphabet_bisaya9);
        button[9] = (Button) rootView.findViewById(R.id.alphabet_bisaya10);

        button[10] = (Button) rootView.findViewById(R.id.alphabet_bisaya11);
        button[11] = (Button) rootView.findViewById(R.id.alphabet_bisaya12);
        button[12] = (Button) rootView.findViewById(R.id.alphabet_bisaya13);
        button[13] = (Button) rootView.findViewById(R.id.alphabet_bisaya14);
        button[14] = (Button) rootView.findViewById(R.id.alphabet_bisaya15);
        button[15] = (Button) rootView.findViewById(R.id.alphabet_bisaya16);
        button[16] = (Button) rootView.findViewById(R.id.alphabet_bisaya17);
        button[17] = (Button) rootView.findViewById(R.id.alphabet_bisaya18);
        button[18] = (Button) rootView.findViewById(R.id.alphabet_bisaya19);
        button[19] = (Button) rootView.findViewById(R.id.alphabet_bisaya20);

        // onClick listener
        for(int x=0 ; x<button.length ; x++){ button[x].setOnClickListener(this); }

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.alphabet_bisaya1: alphabet(0); break;
            case R.id.alphabet_bisaya2: alphabet(1); break;
            case R.id.alphabet_bisaya3: alphabet(2); break;
            case R.id.alphabet_bisaya4: alphabet(3); break;
            case R.id.alphabet_bisaya5: alphabet(4); break;
            case R.id.alphabet_bisaya6: alphabet(5); break;
            case R.id.alphabet_bisaya7: alphabet(6); break;
            case R.id.alphabet_bisaya8: alphabet(7); break;
            case R.id.alphabet_bisaya9: alphabet(8); break;
            case R.id.alphabet_bisaya10: alphabet(9); break;
            case R.id.alphabet_bisaya11: alphabet(10); break;
            case R.id.alphabet_bisaya12: alphabet(11); break;
            case R.id.alphabet_bisaya13: alphabet(12); break;
            case R.id.alphabet_bisaya14: alphabet(13); break;
            case R.id.alphabet_bisaya15: alphabet(14); break;
            case R.id.alphabet_bisaya16: alphabet(15); break;
            case R.id.alphabet_bisaya17: alphabet(16); break;
            case R.id.alphabet_bisaya18: alphabet(17); break;
            case R.id.alphabet_bisaya19: alphabet(18); break;
            case R.id.alphabet_bisaya20: alphabet(19); break;
        }
    }

    // Alphabet
    private void alphabet(int index){
        release_media(mediaplayer);
        mediaplayer[index] = MediaPlayer.create(getActivity(), alphabet_bisaya[index]);
        mediaplayer[index].start();
    }

    // Initialize English
    private void init_bisaya(){
        alphabet_bisaya[0] = R.raw.alphabet_bisaya1_m;
        alphabet_bisaya[1] = R.raw.alphabet_bisaya2_a;
        alphabet_bisaya[2] = R.raw.alphabet_bisaya3_t;

        alphabet_bisaya[3] = R.raw.alphabet_bisaya4_y;
        alphabet_bisaya[4] = R.raw.alphabet_bisaya5_s;
        alphabet_bisaya[5] = R.raw.alphabet_bisaya6_k;

        alphabet_bisaya[6] = R.raw.alphabet_bisaya7_n;
        alphabet_bisaya[7] = R.raw.alphabet_bisaya8_l;
        alphabet_bisaya[8] = R.raw.alphabet_bisaya9_p;

        alphabet_bisaya[9] = R.raw.alphabet_bisaya10_e;
        alphabet_bisaya[10] = R.raw.alphabet_bisaya11_b;
        alphabet_bisaya[11] = R.raw.alphabet_bisaya12_g;

        alphabet_bisaya[12] = R.raw.alphabet_bisaya13_d;
        alphabet_bisaya[13] = R.raw.alphabet_bisaya14_h;
        alphabet_bisaya[14] = R.raw.alphabet_bisaya15_w;

        alphabet_bisaya[15] = R.raw.alphabet_bisaya16_i;
        alphabet_bisaya[16] = R.raw.alphabet_bisaya17_u;
        alphabet_bisaya[17] = R.raw.alphabet_bisaya18_r;

        alphabet_bisaya[18] = R.raw.alphabet_bisaya19_o;
        alphabet_bisaya[19] = R.raw.alphabet_bisaya20_ng;
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
            init_bisaya();
            return null;
        }
    }
}
