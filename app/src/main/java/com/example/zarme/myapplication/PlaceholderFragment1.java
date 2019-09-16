package com.example.zarme.myapplication;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 */
public  class PlaceholderFragment1 extends android.support.v4.app.Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    public PlaceholderFragment1() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment1 newInstance(int sectionNumber) {
        PlaceholderFragment1 fragment = new PlaceholderFragment1();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_tabbed, container, false);
//        GridView gridView = (GridView) rootView.findViewById(R.id.gridview);
//        gridView.setAdapter(new PhotoImageAdapter(rootView.getContext())); // uses the view to get the context instead of getActivity().
        return rootView;
    }
}