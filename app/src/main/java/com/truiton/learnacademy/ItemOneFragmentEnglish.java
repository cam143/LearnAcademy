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

public class ItemOneFragmentEnglish extends Fragment implements View.OnClickListener {

    private final int LENGTH = 26;

    private int alphabet_english[]; // English
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

    public static ItemOneFragmentEnglish newInstance() {
        ItemOneFragmentEnglish fragment = new ItemOneFragmentEnglish();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mediaplayer = new MediaPlayer[LENGTH];
        alphabet_english = new int[LENGTH];
        button = new Button[LENGTH];
        new MyAsyncTask().execute(); // Execute Loading
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_item_one_english, container, false);

        // Initialize
        button[0] = (Button) rootView.findViewById(R.id.alphabet_english1);
        button[1]= (Button) rootView.findViewById(R.id.alphabet_english2);
        button[2]= (Button) rootView.findViewById(R.id.alphabet_english3);
        button[3]= (Button) rootView.findViewById(R.id.alphabet_english4);
        button[4] = (Button) rootView.findViewById(R.id.alphabet_english5);
        button[5] = (Button) rootView.findViewById(R.id.alphabet_english6);
        button[6]= (Button) rootView.findViewById(R.id.alphabet_english7);
        button[7] = (Button) rootView.findViewById(R.id.alphabet_english8);
        button[8] = (Button) rootView.findViewById(R.id.alphabet_english9);
        button[9] = (Button) rootView.findViewById(R.id.alphabet_english10);

        button[10] = (Button) rootView.findViewById(R.id.alphabet_english11);
        button[11] = (Button) rootView.findViewById(R.id.alphabet_english12);
        button[12] = (Button) rootView.findViewById(R.id.alphabet_english13);
        button[13] = (Button) rootView.findViewById(R.id.alphabet_english14);
        button[14] = (Button) rootView.findViewById(R.id.alphabet_english15);
        button[15] = (Button) rootView.findViewById(R.id.alphabet_english16);
        button[16] = (Button) rootView.findViewById(R.id.alphabet_english17);
        button[17] = (Button) rootView.findViewById(R.id.alphabet_english18);
        button[18] = (Button) rootView.findViewById(R.id.alphabet_english19);
        button[19] = (Button) rootView.findViewById(R.id.alphabet_english20);

        button[20] = (Button) rootView.findViewById(R.id.alphabet_english21);
        button[21] = (Button) rootView.findViewById(R.id.alphabet_english22);
        button[22] = (Button) rootView.findViewById(R.id.alphabet_english23);
        button[23] = (Button) rootView.findViewById(R.id.alphabet_english24);
        button[24] = (Button) rootView.findViewById(R.id.alphabet_english25);
        button[25] = (Button) rootView.findViewById(R.id.alphabet_english26);

        // onClick listener
        for(int x=0 ; x<button.length ; x++){ button[x].setOnClickListener(this); }

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.alphabet_english1: alphabet(0); break;
            case R.id.alphabet_english2: alphabet(1); break;
            case R.id.alphabet_english3: alphabet(2); break;
            case R.id.alphabet_english4: alphabet(3); break;
            case R.id.alphabet_english5: alphabet(4); break;
            case R.id.alphabet_english6: alphabet(5); break;
            case R.id.alphabet_english7: alphabet(6); break;
            case R.id.alphabet_english8: alphabet(7);; break;
            case R.id.alphabet_english9: alphabet(8); break;
            case R.id.alphabet_english10: alphabet(9); break;
            case R.id.alphabet_english11: alphabet(10); break;
            case R.id.alphabet_english12: alphabet(11); break;
            case R.id.alphabet_english13: alphabet(12); break;
            case R.id.alphabet_english14: alphabet(13); break;
            case R.id.alphabet_english15: alphabet(14); break;
            case R.id.alphabet_english16: alphabet(15); break;
            case R.id.alphabet_english17: alphabet(16); break;
            case R.id.alphabet_english18: alphabet(17); break;
            case R.id.alphabet_english19: alphabet(18); break;
            case R.id.alphabet_english20: alphabet(19); break;
            case R.id.alphabet_english21: alphabet(20); break;
            case R.id.alphabet_english22: alphabet(21); break;
            case R.id.alphabet_english23: alphabet(22); break;
            case R.id.alphabet_english24: alphabet(23); break;
            case R.id.alphabet_english25: alphabet(24); break;
            case R.id.alphabet_english26: alphabet(25); break;
        }
    }

    // Alphabet
    private void alphabet(int index){
        release_media(mediaplayer);
        mediaplayer[index] = MediaPlayer.create(getActivity(), alphabet_english[index]);
        mediaplayer[index].start();
    }

    // Initialize English
    private void init_english(){
        alphabet_english[0] = R.raw.alphabet_english1_a;
        alphabet_english[1] = R.raw.alphabet_english2_b;
        alphabet_english[2] = R.raw.alphabet_english3_c;
        alphabet_english[3] = R.raw.alphabet_english4_d;
        alphabet_english[4] = R.raw.alphabet_english5_e;
        alphabet_english[5] = R.raw.alphabet_english6_f;
        alphabet_english[6] = R.raw.alphabet_english7_g;
        alphabet_english[7] = R.raw.alphabet_english8_h;
        alphabet_english[8] = R.raw.alphabet_english9_i;
        alphabet_english[9] = R.raw.alphabet_english10_j;
        alphabet_english[10] = R.raw.alphabet_english11_k;

        alphabet_english[11] = R.raw.alphabet_english12_l;
        alphabet_english[12] = R.raw.alphabet_english13_m;
        alphabet_english[13] = R.raw.alphabet_english14_n;
        alphabet_english[14] = R.raw.alphabet_english15_o;
        alphabet_english[15] = R.raw.alphabet_english16_p;
        alphabet_english[16] = R.raw.alphabet_english17_q;
        alphabet_english[17] = R.raw.alphabet_english18_r;
        alphabet_english[18] = R.raw.alphabet_english19_s;
        alphabet_english[19] = R.raw.alphabet_english20_t;
        alphabet_english[20] = R.raw.alphabet_english21_u;

        alphabet_english[21] = R.raw.alphabet_english22_v;
        alphabet_english[22] = R.raw.alphabet_english23_w;
        alphabet_english[23] = R.raw.alphabet_english24_x;
        alphabet_english[24] = R.raw.alphabet_english25_y;
        alphabet_english[25] = R.raw.alphabet_english26_z;
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
            init_english();
            return null;
        }
    }
}
