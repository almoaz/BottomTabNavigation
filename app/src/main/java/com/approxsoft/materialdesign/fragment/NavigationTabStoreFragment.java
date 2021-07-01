package com.approxsoft.materialdesign.fragment;

import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.approxsoft.materialdesign.R;
import com.approxsoft.materialdesign.Tools.Tools;

public class NavigationTabStoreFragment extends Fragment {


    public NavigationTabStoreFragment() {

    }

    public static NavigationTabStoreFragment newInstance() {
        NavigationTabStoreFragment fragment = new NavigationTabStoreFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_navigation_tab_store, container, false);

        Tools.displayImageOriginal(getActivity(), (ImageView) view.findViewById(R.id.image1), R.drawable.image1);
        Tools.displayImageOriginal(getActivity(), (ImageView) view.findViewById(R.id.image2), R.drawable.image2);
        Tools.displayImageOriginal(getActivity(), (ImageView) view.findViewById(R.id.image3), R.drawable.image3);
        Tools.displayImageOriginal(getActivity(), (ImageView) view.findViewById(R.id.image4), R.drawable.image4);
        Tools.displayImageOriginal(getActivity(), (ImageView) view.findViewById(R.id.image5), R.drawable.image5);
        Tools.displayImageOriginal(getActivity(), (ImageView) view.findViewById(R.id.image6), R.drawable.image1);
        Tools.displayImageOriginal(getActivity(), (ImageView) view.findViewById(R.id.image7), R.drawable.image2);
        Tools.displayImageOriginal(getActivity(), (ImageView) view.findViewById(R.id.image8), R.drawable.image3);
        Tools.displayImageOriginal(getActivity(), (ImageView) view.findViewById(R.id.image9), R.drawable.image4);


        return view;
    }


}

