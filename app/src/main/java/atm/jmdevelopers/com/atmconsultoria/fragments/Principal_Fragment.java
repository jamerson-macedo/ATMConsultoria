package atm.jmdevelopers.com.atmconsultoria.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import atm.jmdevelopers.com.atmconsultoria.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Principal_Fragment extends Fragment {


    public Principal_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_principal, container, false);
    }

}
