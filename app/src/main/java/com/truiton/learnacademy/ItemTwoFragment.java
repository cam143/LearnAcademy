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

public class ItemTwoFragment extends Fragment implements View.OnClickListener {

    private final int LENGTH = 101;

    private int number_bisaya[]; // Bisaya
    private int number_english[]; // English
    private int number_tagalog[];// Tagalog

    private MediaPlayer mediaplayer[]; // MediaPlayer
    private Button button[]; // Buttons

    public static ItemTwoFragment newInstance() {
        ItemTwoFragment fragment = new ItemTwoFragment();
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
        number_bisaya = new int[LENGTH];
        number_english = new int[LENGTH];
        number_tagalog = new int[LENGTH];
        button = new Button[LENGTH];
        new MyAsyncTask().execute();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_item_two, container, false);

        // Initialize
        button[0] = (Button) rootView.findViewById(R.id.number_0);

        button[1] = (Button) rootView.findViewById(R.id.number_1);
        button[2] = (Button) rootView.findViewById(R.id.number_2);
        button[3] = (Button) rootView.findViewById(R.id.number_3);
        button[4] = (Button) rootView.findViewById(R.id.number_4);
        button[5] = (Button) rootView.findViewById(R.id.number_5);
        button[6] = (Button) rootView.findViewById(R.id.number_6);
        button[7] = (Button) rootView.findViewById(R.id.number_7);
        button[8] = (Button) rootView.findViewById(R.id.number_8);
        button[9] = (Button) rootView.findViewById(R.id.number_9);
        button[10] = (Button) rootView.findViewById(R.id.number_10);

        button[11] = (Button) rootView.findViewById(R.id.number_11);
        button[12] = (Button) rootView.findViewById(R.id.number_12);
        button[13] = (Button) rootView.findViewById(R.id.number_13);
        button[14] = (Button) rootView.findViewById(R.id.number_14);
        button[15] = (Button) rootView.findViewById(R.id.number_15);
        button[16] = (Button) rootView.findViewById(R.id.number_16);
        button[17] = (Button) rootView.findViewById(R.id.number_17);
        button[18] = (Button) rootView.findViewById(R.id.number_18);
        button[19] = (Button) rootView.findViewById(R.id.number_19);
        button[20] = (Button) rootView.findViewById(R.id.number_20);

        button[21] = (Button) rootView.findViewById(R.id.number_21);
        button[22] = (Button) rootView.findViewById(R.id.number_22);
        button[23] = (Button) rootView.findViewById(R.id.number_23);
        button[24] = (Button) rootView.findViewById(R.id.number_24);
        button[25] = (Button) rootView.findViewById(R.id.number_25);
        button[26] = (Button) rootView.findViewById(R.id.number_26);
        button[27] = (Button) rootView.findViewById(R.id.number_27);
        button[28] = (Button) rootView.findViewById(R.id.number_28);
        button[29] = (Button) rootView.findViewById(R.id.number_29);
        button[30] = (Button) rootView.findViewById(R.id.number_30);

        button[31] = (Button) rootView.findViewById(R.id.number_31);
        button[32] = (Button) rootView.findViewById(R.id.number_32);
        button[33] = (Button) rootView.findViewById(R.id.number_33);
        button[34] = (Button) rootView.findViewById(R.id.number_34);
        button[35] = (Button) rootView.findViewById(R.id.number_35);
        button[36] = (Button) rootView.findViewById(R.id.number_36);
        button[37] = (Button) rootView.findViewById(R.id.number_37);
        button[38] = (Button) rootView.findViewById(R.id.number_38);
        button[39] = (Button) rootView.findViewById(R.id.number_39);
        button[40] = (Button) rootView.findViewById(R.id.number_40);

        button[41] = (Button) rootView.findViewById(R.id.number_41);
        button[42] = (Button) rootView.findViewById(R.id.number_42);
        button[43] = (Button) rootView.findViewById(R.id.number_43);
        button[44] = (Button) rootView.findViewById(R.id.number_44);
        button[45] = (Button) rootView.findViewById(R.id.number_45);
        button[46] = (Button) rootView.findViewById(R.id.number_46);
        button[47] = (Button) rootView.findViewById(R.id.number_47);
        button[48] = (Button) rootView.findViewById(R.id.number_48);
        button[49] = (Button) rootView.findViewById(R.id.number_49);
        button[50] = (Button) rootView.findViewById(R.id.number_50);

        button[51] = (Button) rootView.findViewById(R.id.number_51);
        button[52] = (Button) rootView.findViewById(R.id.number_52);
        button[53] = (Button) rootView.findViewById(R.id.number_53);
        button[54] = (Button) rootView.findViewById(R.id.number_54);
        button[55] = (Button) rootView.findViewById(R.id.number_55);
        button[56] = (Button) rootView.findViewById(R.id.number_56);
        button[57] = (Button) rootView.findViewById(R.id.number_57);
        button[58] = (Button) rootView.findViewById(R.id.number_58);
        button[59] = (Button) rootView.findViewById(R.id.number_59);
        button[60] = (Button) rootView.findViewById(R.id.number_60);

        button[61] = (Button) rootView.findViewById(R.id.number_61);
        button[62] = (Button) rootView.findViewById(R.id.number_62);
        button[63] = (Button) rootView.findViewById(R.id.number_63);
        button[64] = (Button) rootView.findViewById(R.id.number_64);
        button[65] = (Button) rootView.findViewById(R.id.number_65);
        button[66] = (Button) rootView.findViewById(R.id.number_66);
        button[67] = (Button) rootView.findViewById(R.id.number_67);
        button[68] = (Button) rootView.findViewById(R.id.number_68);
        button[69] = (Button) rootView.findViewById(R.id.number_69);
        button[70] = (Button) rootView.findViewById(R.id.number_70);

        button[71] = (Button) rootView.findViewById(R.id.number_71);
        button[72] = (Button) rootView.findViewById(R.id.number_72);
        button[73] = (Button) rootView.findViewById(R.id.number_73);
        button[74] = (Button) rootView.findViewById(R.id.number_74);
        button[75] = (Button) rootView.findViewById(R.id.number_75);
        button[76] = (Button) rootView.findViewById(R.id.number_76);
        button[77] = (Button) rootView.findViewById(R.id.number_77);
        button[78] = (Button) rootView.findViewById(R.id.number_78);
        button[79] = (Button) rootView.findViewById(R.id.number_79);
        button[80] = (Button) rootView.findViewById(R.id.number_80);

        button[81] = (Button) rootView.findViewById(R.id.number_81);
        button[82] = (Button) rootView.findViewById(R.id.number_82);
        button[83] = (Button) rootView.findViewById(R.id.number_83);
        button[84] = (Button) rootView.findViewById(R.id.number_84);
        button[85] = (Button) rootView.findViewById(R.id.number_85);
        button[86] = (Button) rootView.findViewById(R.id.number_86);
        button[87] = (Button) rootView.findViewById(R.id.number_87);
        button[88] = (Button) rootView.findViewById(R.id.number_88);
        button[89] = (Button) rootView.findViewById(R.id.number_89);
        button[90] = (Button) rootView.findViewById(R.id.number_90);

        button[91] = (Button) rootView.findViewById(R.id.number_91);
        button[92] = (Button) rootView.findViewById(R.id.number_92);
        button[93] = (Button) rootView.findViewById(R.id.number_93);
        button[94] = (Button) rootView.findViewById(R.id.number_94);
        button[95] = (Button) rootView.findViewById(R.id.number_95);
        button[96] = (Button) rootView.findViewById(R.id.number_96);
        button[97] = (Button) rootView.findViewById(R.id.number_97);
        button[98] = (Button) rootView.findViewById(R.id.number_98);
        button[99] = (Button) rootView.findViewById(R.id.number_99);
        button[100] = (Button) rootView.findViewById(R.id.number_100);

        // onClick listener
        for(int x=0 ; x<button.length ; x++){ button[x].setOnClickListener(this); }

        return rootView;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.number_0:  number(0);   break;

            case R.id.number_1:  number(1);   break;
            case R.id.number_2:  number(2);   break;
            case R.id.number_3:  number(3);   break;
            case R.id.number_4:  number(4);   break;
            case R.id.number_5:  number(5);   break;
            case R.id.number_6:  number(6);   break;
            case R.id.number_7:  number(7);   break;
            case R.id.number_8:  number(8);   break;
            case R.id.number_9:  number(9);   break;
            case R.id.number_10:  number(10);   break;

            case R.id.number_11:  number(11);   break;
            case R.id.number_12:  number(12);   break;
            case R.id.number_13:  number(13);   break;
            case R.id.number_14:  number(14);   break;
            case R.id.number_15:  number(15);   break;
            case R.id.number_16:  number(16);   break;
            case R.id.number_17:  number(17);   break;
            case R.id.number_18:  number(18);   break;
            case R.id.number_19:  number(19);   break;
            case R.id.number_20:  number(20);   break;

            case R.id.number_21:  number(21);   break;
            case R.id.number_22:  number(22);   break;
            case R.id.number_23:  number(23);   break;
            case R.id.number_24:  number(24);   break;
            case R.id.number_25:  number(25);   break;
            case R.id.number_26:  number(26);   break;
            case R.id.number_27:  number(27);   break;
            case R.id.number_28:  number(28);   break;
            case R.id.number_29:  number(29);   break;
            case R.id.number_30:  number(30);   break;

            case R.id.number_31:  number(31);   break;
            case R.id.number_32:  number(32);   break;
            case R.id.number_33:  number(33);   break;
            case R.id.number_34:  number(34);   break;
            case R.id.number_35:  number(35);   break;
            case R.id.number_36:  number(36);   break;
            case R.id.number_37:  number(37);   break;
            case R.id.number_38:  number(38);   break;
            case R.id.number_39:  number(39);   break;
            case R.id.number_40:  number(40);   break;

            case R.id.number_41:  number(41);   break;
            case R.id.number_42:  number(42);   break;
            case R.id.number_43:  number(43);   break;
            case R.id.number_44:  number(44);   break;
            case R.id.number_45:  number(45);   break;
            case R.id.number_46:  number(46);   break;
            case R.id.number_47:  number(47);   break;
            case R.id.number_48:  number(48);   break;
            case R.id.number_49:  number(49);   break;
            case R.id.number_50:  number(50);   break;

            case R.id.number_51:  number(51);   break;
            case R.id.number_52:  number(52);   break;
            case R.id.number_53:  number(53);   break;
            case R.id.number_54:  number(54);   break;
            case R.id.number_55:  number(55);   break;
            case R.id.number_56:  number(56);   break;
            case R.id.number_57:  number(57);   break;
            case R.id.number_58:  number(58);   break;
            case R.id.number_59:  number(59);   break;
            case R.id.number_60:  number(60);   break;

            case R.id.number_61:  number(61);   break;
            case R.id.number_62:  number(62);   break;
            case R.id.number_63:  number(63);   break;
            case R.id.number_64:  number(64);   break;
            case R.id.number_65:  number(65);   break;
            case R.id.number_66:  number(66);   break;
            case R.id.number_67:  number(67);   break;
            case R.id.number_68:  number(68);   break;
            case R.id.number_69:  number(69);   break;
            case R.id.number_70:  number(70);   break;

            case R.id.number_71:  number(71);   break;
            case R.id.number_72:  number(72);   break;
            case R.id.number_73:  number(73);   break;
            case R.id.number_74:  number(74);   break;
            case R.id.number_75:  number(75);   break;
            case R.id.number_76:  number(76);   break;
            case R.id.number_77:  number(77);   break;
            case R.id.number_78:  number(78);   break;
            case R.id.number_79:  number(79);   break;
            case R.id.number_80:  number(80);   break;

            case R.id.number_81:  number(81);   break;
            case R.id.number_82:  number(82);   break;
            case R.id.number_83:  number(83);   break;
            case R.id.number_84:  number(84);   break;
            case R.id.number_85:  number(85);   break;
            case R.id.number_86:  number(86);   break;
            case R.id.number_87:  number(87);   break;
            case R.id.number_88:  number(88);   break;
            case R.id.number_89:  number(89);   break;
            case R.id.number_90:  number(90);   break;

            case R.id.number_91:  number(91);   break;
            case R.id.number_92:  number(92);   break;
            case R.id.number_93:  number(93);   break;
            case R.id.number_94:  number(94);   break;
            case R.id.number_95:  number(95);   break;
            case R.id.number_96:  number(96);   break;
            case R.id.number_97:  number(97);   break;
            case R.id.number_98:  number(98);   break;
            case R.id.number_99:  number(99);   break;
            case R.id.number_100:  number(100);   break;
        }
    }

    // Number
    private void number(int index){
        release_media(mediaplayer);
        switch (EventStatus.app_status){
            case EventStatus.option1_status: mediaplayer[index] = MediaPlayer.create(getActivity(), number_bisaya[index]); break;
            case EventStatus.option2_status: mediaplayer[index] = MediaPlayer.create(getActivity(), number_english[index]); break;
            case EventStatus.option3_status: mediaplayer[index] = MediaPlayer.create(getActivity(), number_tagalog[index]); break;
        }
        mediaplayer[index].start();
    }

    // Initialize Bisaya
    private void init_bisaya(){
        number_bisaya[0] = R.raw.number_bisaya_0;

        number_bisaya[1] = R.raw.number_bisaya_1;
        number_bisaya[2] = R.raw.number_bisaya_2;
        number_bisaya[3] = R.raw.number_bisaya_3;
        number_bisaya[4] = R.raw.number_bisaya_4;
        number_bisaya[5] = R.raw.number_bisaya_5;
        number_bisaya[6] = R.raw.number_bisaya_6;
        number_bisaya[7] = R.raw.number_bisaya_7;
        number_bisaya[8] = R.raw.number_bisaya_8;
        number_bisaya[9] = R.raw.number_bisaya_9;
        number_bisaya[10] = R.raw.number_bisaya_10;

        number_bisaya[11] = R.raw.number_bisaya_11;
        number_bisaya[12] = R.raw.number_bisaya_12;
        number_bisaya[13] = R.raw.number_bisaya_13;
        number_bisaya[14] = R.raw.number_bisaya_14;
        number_bisaya[15] = R.raw.number_bisaya_15;
        number_bisaya[16] = R.raw.number_bisaya_16;
        number_bisaya[17] = R.raw.number_bisaya_17;
        number_bisaya[18] = R.raw.number_bisaya_18;
        number_bisaya[19] = R.raw.number_bisaya_19;
        number_bisaya[20] = R.raw.number_bisaya_20;

        number_bisaya[21] = R.raw.number_bisaya_21;
        number_bisaya[22] = R.raw.number_bisaya_22;
        number_bisaya[23] = R.raw.number_bisaya_23;
        number_bisaya[24] = R.raw.number_bisaya_24;
        number_bisaya[25] = R.raw.number_bisaya_25;
        number_bisaya[26] = R.raw.number_bisaya_26;
        number_bisaya[27] = R.raw.number_bisaya_27;
        number_bisaya[28] = R.raw.number_bisaya_28;
        number_bisaya[29] = R.raw.number_bisaya_29;
        number_bisaya[30] = R.raw.number_bisaya_30;

        number_bisaya[31] = R.raw.number_bisaya_31;
        number_bisaya[32] = R.raw.number_bisaya_32;
        number_bisaya[33] = R.raw.number_bisaya_33;
        number_bisaya[34] = R.raw.number_bisaya_34;
        number_bisaya[35] = R.raw.number_bisaya_35;
        number_bisaya[36] = R.raw.number_bisaya_36;
        number_bisaya[37] = R.raw.number_bisaya_37;
        number_bisaya[38] = R.raw.number_bisaya_38;
        number_bisaya[39] = R.raw.number_bisaya_39;
        number_bisaya[40] = R.raw.number_bisaya_40;

        number_bisaya[41] = R.raw.number_bisaya_41;
        number_bisaya[42] = R.raw.number_bisaya_42;
        number_bisaya[43] = R.raw.number_bisaya_43;
        number_bisaya[44] = R.raw.number_bisaya_44;
        number_bisaya[45] = R.raw.number_bisaya_45;
        number_bisaya[46] = R.raw.number_bisaya_46;
        number_bisaya[47] = R.raw.number_bisaya_47;
        number_bisaya[48] = R.raw.number_bisaya_48;
        number_bisaya[49] = R.raw.number_bisaya_49;
        number_bisaya[50] = R.raw.number_bisaya_50;

        number_bisaya[51] = R.raw.number_bisaya_51;
        number_bisaya[52] = R.raw.number_bisaya_52;
        number_bisaya[53] = R.raw.number_bisaya_53;
        number_bisaya[54] = R.raw.number_bisaya_54;
        number_bisaya[55] = R.raw.number_bisaya_55;
        number_bisaya[56] = R.raw.number_bisaya_56;
        number_bisaya[57] = R.raw.number_bisaya_57;
        number_bisaya[58] = R.raw.number_bisaya_58;
        number_bisaya[59] = R.raw.number_bisaya_59;
        number_bisaya[60] = R.raw.number_bisaya_60;

        number_bisaya[61] = R.raw.number_bisaya_61;
        number_bisaya[62] = R.raw.number_bisaya_62;
        number_bisaya[63] = R.raw.number_bisaya_63;
        number_bisaya[64] = R.raw.number_bisaya_64;
        number_bisaya[65] = R.raw.number_bisaya_65;
        number_bisaya[66] = R.raw.number_bisaya_66;
        number_bisaya[67] = R.raw.number_bisaya_67;
        number_bisaya[68] = R.raw.number_bisaya_68;
        number_bisaya[69] = R.raw.number_bisaya_69;
        number_bisaya[70] = R.raw.number_bisaya_70;

        number_bisaya[71] = R.raw.number_bisaya_71;
        number_bisaya[72] = R.raw.number_bisaya_72;
        number_bisaya[73] = R.raw.number_bisaya_73;
        number_bisaya[74] = R.raw.number_bisaya_74;
        number_bisaya[75] = R.raw.number_bisaya_75;
        number_bisaya[76] = R.raw.number_bisaya_76;
        number_bisaya[77] = R.raw.number_bisaya_77;
        number_bisaya[78] = R.raw.number_bisaya_78;
        number_bisaya[79] = R.raw.number_bisaya_79;
        number_bisaya[80] = R.raw.number_bisaya_80;

        number_bisaya[81] = R.raw.number_bisaya_81;
        number_bisaya[82] = R.raw.number_bisaya_82;
        number_bisaya[83] = R.raw.number_bisaya_83;
        number_bisaya[84] = R.raw.number_bisaya_84;
        number_bisaya[85] = R.raw.number_bisaya_85;
        number_bisaya[86] = R.raw.number_bisaya_86;
        number_bisaya[87] = R.raw.number_bisaya_87;
        number_bisaya[88] = R.raw.number_bisaya_88;
        number_bisaya[89] = R.raw.number_bisaya_89;
        number_bisaya[90] = R.raw.number_bisaya_90;

        number_bisaya[91] = R.raw.number_bisaya_91;
        number_bisaya[92] = R.raw.number_bisaya_92;
        number_bisaya[93] = R.raw.number_bisaya_93;
        number_bisaya[94] = R.raw.number_bisaya_94;
        number_bisaya[95] = R.raw.number_bisaya_95;
        number_bisaya[96] = R.raw.number_bisaya_96;
        number_bisaya[97] = R.raw.number_bisaya_97;
        number_bisaya[98] = R.raw.number_bisaya_98;
        number_bisaya[99] = R.raw.number_bisaya_99;
        number_bisaya[100] = R.raw.number_bisaya_100;
    }

    // Initialize English
    private void init_english(){
        number_english[0] = R.raw.number_english_0;

        number_english[1] = R.raw.number_english_1;
        number_english[2] = R.raw.number_english_2;
        number_english[3] = R.raw.number_english_3;
        number_english[4] = R.raw.number_english_4;
        number_english[5] = R.raw.number_english_5;
        number_english[6] = R.raw.number_english_6;
        number_english[7] = R.raw.number_english_7;
        number_english[8] = R.raw.number_english_8;
        number_english[9] = R.raw.number_english_9;
        number_english[10] = R.raw.number_english_10;

        number_english[11] = R.raw.number_english_11;
        number_english[12] = R.raw.number_english_12;
        number_english[13] = R.raw.number_english_13;
        number_english[14] = R.raw.number_english_14;
        number_english[15] = R.raw.number_english_15;
        number_english[16] = R.raw.number_english_16;
        number_english[17] = R.raw.number_english_17;
        number_english[18] = R.raw.number_english_18;
        number_english[19] = R.raw.number_english_19;
        number_english[20] = R.raw.number_english_20;

        number_english[21] = R.raw.number_english_21;
        number_english[22] = R.raw.number_english_22;
        number_english[23] = R.raw.number_english_23;
        number_english[24] = R.raw.number_english_24;
        number_english[25] = R.raw.number_english_25;
        number_english[26] = R.raw.number_english_26;
        number_english[27] = R.raw.number_english_27;
        number_english[28] = R.raw.number_english_28;
        number_english[29] = R.raw.number_english_29;
        number_english[30] = R.raw.number_english_30;

        number_english[31] = R.raw.number_english_31;
        number_english[32] = R.raw.number_english_32;
        number_english[33] = R.raw.number_english_33;
        number_english[34] = R.raw.number_english_34;
        number_english[35] = R.raw.number_english_35;
        number_english[36] = R.raw.number_english_36;
        number_english[37] = R.raw.number_english_37;
        number_english[38] = R.raw.number_english_38;
        number_english[39] = R.raw.number_english_39;
        number_english[40] = R.raw.number_english_40;

        number_english[41] = R.raw.number_english_41;
        number_english[42] = R.raw.number_english_42;
        number_english[43] = R.raw.number_english_43;
        number_english[44] = R.raw.number_english_44;
        number_english[45] = R.raw.number_english_45;
        number_english[46] = R.raw.number_english_46;
        number_english[47] = R.raw.number_english_47;
        number_english[48] = R.raw.number_english_48;
        number_english[49] = R.raw.number_english_49;
        number_english[50] = R.raw.number_english_50;

        number_english[51] = R.raw.number_english_51;
        number_english[52] = R.raw.number_english_52;
        number_english[53] = R.raw.number_english_53;
        number_english[54] = R.raw.number_english_54;
        number_english[55] = R.raw.number_english_55;
        number_english[56] = R.raw.number_english_56;
        number_english[57] = R.raw.number_english_57;
        number_english[58] = R.raw.number_english_58;
        number_english[59] = R.raw.number_english_59;
        number_english[60] = R.raw.number_english_60;

        number_english[61] = R.raw.number_english_61;
        number_english[62] = R.raw.number_english_62;
        number_english[63] = R.raw.number_english_63;
        number_english[64] = R.raw.number_english_64;
        number_english[65] = R.raw.number_english_65;
        number_english[66] = R.raw.number_english_66;
        number_english[67] = R.raw.number_english_67;
        number_english[68] = R.raw.number_english_68;
        number_english[69] = R.raw.number_english_69;
        number_english[70] = R.raw.number_english_70;

        number_english[71] = R.raw.number_english_71;
        number_english[72] = R.raw.number_english_72;
        number_english[73] = R.raw.number_english_73;
        number_english[74] = R.raw.number_english_74;
        number_english[75] = R.raw.number_english_75;
        number_english[76] = R.raw.number_english_76;
        number_english[77] = R.raw.number_english_77;
        number_english[78] = R.raw.number_english_78;
        number_english[79] = R.raw.number_english_79;
        number_english[80] = R.raw.number_english_80;

        number_english[81] = R.raw.number_english_81;
        number_english[82] = R.raw.number_english_82;
        number_english[83] = R.raw.number_english_83;
        number_english[84] = R.raw.number_english_84;
        number_english[85] = R.raw.number_english_85;
        number_english[86] = R.raw.number_english_86;
        number_english[87] = R.raw.number_english_87;
        number_english[88] = R.raw.number_english_88;
        number_english[89] = R.raw.number_english_89;
        number_english[90] = R.raw.number_english_90;

        number_english[91] = R.raw.number_english_91;
        number_english[92] = R.raw.number_english_92;
        number_english[93] = R.raw.number_english_93;
        number_english[94] = R.raw.number_english_94;
        number_english[95] = R.raw.number_english_95;
        number_english[96] = R.raw.number_english_96;
        number_english[97] = R.raw.number_english_97;
        number_english[98] = R.raw.number_english_98;
        number_english[99] = R.raw.number_english_99;
        number_english[100] = R.raw.number_english_100;
    }

    // Initialize Tagalog
    private void init_tagalog(){
        number_tagalog[0] = R.raw.number_tagalog_0;

        number_tagalog[1] = R.raw.number_tagalog_1;
        number_tagalog[2] = R.raw.number_tagalog_2;
        number_tagalog[3] = R.raw.number_tagalog_3;
        number_tagalog[4] = R.raw.number_tagalog_4;
        number_tagalog[5] = R.raw.number_tagalog_5;
        number_tagalog[6] = R.raw.number_tagalog_6;
        number_tagalog[7] = R.raw.number_tagalog_7;
        number_tagalog[8] = R.raw.number_tagalog_8;
        number_tagalog[9] = R.raw.number_tagalog_9;
        number_tagalog[10] = R.raw.number_tagalog_10;

        number_tagalog[11] = R.raw.number_tagalog_11;
        number_tagalog[12] = R.raw.number_tagalog_12;
        number_tagalog[13] = R.raw.number_tagalog_13;
        number_tagalog[14] = R.raw.number_tagalog_14;
        number_tagalog[15] = R.raw.number_tagalog_15;
        number_tagalog[16] = R.raw.number_tagalog_16;
        number_tagalog[17] = R.raw.number_tagalog_17;
        number_tagalog[18] = R.raw.number_tagalog_18;
        number_tagalog[19] = R.raw.number_tagalog_19;
        number_tagalog[20] = R.raw.number_tagalog_20;

        number_tagalog[21] = R.raw.number_tagalog_21;
        number_tagalog[22] = R.raw.number_tagalog_22;
        number_tagalog[23] = R.raw.number_tagalog_23;
        number_tagalog[24] = R.raw.number_tagalog_24;
        number_tagalog[25] = R.raw.number_tagalog_25;
        number_tagalog[26] = R.raw.number_tagalog_26;
        number_tagalog[27] = R.raw.number_tagalog_27;
        number_tagalog[28] = R.raw.number_tagalog_28;
        number_tagalog[29] = R.raw.number_tagalog_29;
        number_tagalog[30] = R.raw.number_tagalog_30;

        number_tagalog[31] = R.raw.number_tagalog_31;
        number_tagalog[32] = R.raw.number_tagalog_32;
        number_tagalog[33] = R.raw.number_tagalog_33;
        number_tagalog[34] = R.raw.number_tagalog_34;
        number_tagalog[35] = R.raw.number_tagalog_35;
        number_tagalog[36] = R.raw.number_tagalog_36;
        number_tagalog[37] = R.raw.number_tagalog_37;
        number_tagalog[38] = R.raw.number_tagalog_38;
        number_tagalog[39] = R.raw.number_tagalog_39;
        number_tagalog[40] = R.raw.number_tagalog_40;

        number_tagalog[41] = R.raw.number_tagalog_41;
        number_tagalog[42] = R.raw.number_tagalog_42;
        number_tagalog[43] = R.raw.number_tagalog_43;
        number_tagalog[44] = R.raw.number_tagalog_44;
        number_tagalog[45] = R.raw.number_tagalog_45;
        number_tagalog[46] = R.raw.number_tagalog_46;
        number_tagalog[47] = R.raw.number_tagalog_47;
        number_tagalog[48] = R.raw.number_tagalog_48;
        number_tagalog[49] = R.raw.number_tagalog_49;
        number_tagalog[50] = R.raw.number_tagalog_50;

        number_tagalog[51] = R.raw.number_tagalog_51;
        number_tagalog[52] = R.raw.number_tagalog_52;
        number_tagalog[53] = R.raw.number_tagalog_53;
        number_tagalog[54] = R.raw.number_tagalog_54;
        number_tagalog[55] = R.raw.number_tagalog_55;
        number_tagalog[56] = R.raw.number_tagalog_56;
        number_tagalog[57] = R.raw.number_tagalog_57;
        number_tagalog[58] = R.raw.number_tagalog_58;
        number_tagalog[59] = R.raw.number_tagalog_59;
        number_tagalog[60] = R.raw.number_tagalog_60;

        number_tagalog[61] = R.raw.number_tagalog_61;
        number_tagalog[62] = R.raw.number_tagalog_62;
        number_tagalog[63] = R.raw.number_tagalog_63;
        number_tagalog[64] = R.raw.number_tagalog_64;
        number_tagalog[65] = R.raw.number_tagalog_65;
        number_tagalog[66] = R.raw.number_tagalog_66;
        number_tagalog[67] = R.raw.number_tagalog_67;
        number_tagalog[68] = R.raw.number_tagalog_68;
        number_tagalog[69] = R.raw.number_tagalog_69;
        number_tagalog[70] = R.raw.number_tagalog_70;

        number_tagalog[71] = R.raw.number_tagalog_71;
        number_tagalog[72] = R.raw.number_tagalog_72;
        number_tagalog[73] = R.raw.number_tagalog_73;
        number_tagalog[74] = R.raw.number_tagalog_74;
        number_tagalog[75] = R.raw.number_tagalog_75;
        number_tagalog[76] = R.raw.number_tagalog_76;
        number_tagalog[77] = R.raw.number_tagalog_77;
        number_tagalog[78] = R.raw.number_tagalog_78;
        number_tagalog[79] = R.raw.number_tagalog_79;
        number_tagalog[80] = R.raw.number_tagalog_80;

        number_tagalog[81] = R.raw.number_tagalog_81;
        number_tagalog[82] = R.raw.number_tagalog_82;
        number_tagalog[83] = R.raw.number_tagalog_83;
        number_tagalog[84] = R.raw.number_tagalog_84;
        number_tagalog[85] = R.raw.number_tagalog_85;
        number_tagalog[86] = R.raw.number_tagalog_86;
        number_tagalog[87] = R.raw.number_tagalog_87;
        number_tagalog[88] = R.raw.number_tagalog_88;
        number_tagalog[89] = R.raw.number_tagalog_89;
        number_tagalog[90] = R.raw.number_tagalog_90;

        number_tagalog[91] = R.raw.number_tagalog_91;
        number_tagalog[92] = R.raw.number_tagalog_92;
        number_tagalog[93] = R.raw.number_tagalog_93;
        number_tagalog[94] = R.raw.number_tagalog_94;
        number_tagalog[95] = R.raw.number_tagalog_95;
        number_tagalog[96] = R.raw.number_tagalog_96;
        number_tagalog[97] = R.raw.number_tagalog_97;
        number_tagalog[98] = R.raw.number_tagalog_98;
        number_tagalog[99] = R.raw.number_tagalog_99;
        number_tagalog[100] = R.raw.number_tagalog_100;
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
