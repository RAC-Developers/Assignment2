package com.example.zarme.myapplication;


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

public class PlaceholderFragment4 extends android.support.v4.app.Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";

    int count=1;
    FrameLayout frame;
    ImageView imageview;
    public PlaceholderFragment4() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment4 newInstance(int sectionNumber) {
        PlaceholderFragment4 fragment = new PlaceholderFragment4();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_frame, container, false);
        //TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        // textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
        frame= (FrameLayout)rootView.findViewById(R.id.framelayout);
        return rootView;
    }

    public  void btnclick(View v) {
        // Hide current image
        imageview = (ImageView) frame.findViewWithTag(String.valueOf(count));
        imageview.setVisibility(android.view.View.INVISIBLE);

        // go to next image
        count ++;
        if (count>3)
            count=1;

        // Show next image
        imageview=(ImageView)frame.findViewWithTag(String.valueOf(count));
        imageview.setVisibility(android.view.View.VISIBLE);

    }
}
