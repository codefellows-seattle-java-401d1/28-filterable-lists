package com.example.a28_filterable_lists;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.a28_filterable_lists.fabrics.FabricData;
import com.example.a28_filterable_lists.fabrics.Fabrics;

import java.util.List;

//This Fragment is what holds the information to put into the "container" space that was created on the back activity template. It is essentially like filling in an empty div on HTML using JS like we did in 201 and 301.

//This is what I had originally started writing on the "DetailFragment" file of my previous attempt at this.
//Implementing TextWatcher is brand new to me and came from the demo on Lab 28. I did not add it.
//I believe TextWatcher is necessary for the search functions written below.
public class FabricsFragment extends Fragment
        implements TextWatcher {

    //This came in with the demo code
    private EditText mSearch;

    //Create a reference to the list. I wrote this from watching the video.
    private List<Fabrics> fabrics;

    //I wrote these from watching the videos
    //Create a RecyclerView reference so we can pull in reference to that activity below.
    private RecyclerView mRecyclerView;
    //The Layout Manager is needed but I do not remember why. It was missed on Video 2 but corrected on Video 3. It is what caused Steve's Star Trek list to not show originally since the reference was missing until video 3.
    private RecyclerView.LayoutManager mLayoutManager;
    //Create a reference to the Adapter that will be used by the RecycleVie below to display the list.
    private FabricsAdapter mAdapter;

    @Override
    public View onCreateView(
            LayoutInflater inflater,
            ViewGroup container,
            Bundle savedInstanceState
    ) {
        View view = inflater.inflate(
                R.layout.fragment_fabrics,
                container, false
        );

        //These mSearch's are from the demo code
        mSearch = view.findViewById(R.id.search);
        mSearch.addTextChangedListener(this);

        //I had this information from here until the end of the function from watching the videos this morning.
        fabrics = FabricData.get().fabrics();

        mRecyclerView = view.findViewById(R.id.list);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new FabricsAdapter(fabrics);
        mRecyclerView.setAdapter(mAdapter);

        return view;
    }

    //This is all for using the search bar and filtering it.
    //I forgot this was on the demo code. I was focused on getting the
    //list to display. I didn't type any of this and I'm mad at myself for missing that opportunity.

    //Before typing into the search bar, don't do anything to the list
    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        // do nothing
    }

    //After typing anything into the search bar...
    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        //convert everything to lower case
        String filter = s.toString().toLowerCase();
        //filter through the data on the list for matches
        List<Fabrics> filtered = FabricData.search(filter);

        //update the adapter with the filtered results
        mAdapter = new FabricsAdapter(filtered);
        //display the filtered results
        mRecyclerView.setAdapter(mAdapter);
    }

    //After you stop typing on the search bar, don't do anything to change the list.
    @Override
    public void afterTextChanged(Editable s) {
        // do nothing
    }
}
