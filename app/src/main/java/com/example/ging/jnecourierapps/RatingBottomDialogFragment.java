package com.example.ging.jnecourierapps;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class RatingBottomDialogFragment extends BottomSheetDialogFragment {

    Button rating_tutup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottomsheet_profile_rating, container, false);
        rating_tutup = view.findViewById(R.id.rating_tutup);

        rating_tutup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RatingBottomDialogFragment.this.dismiss();
            }
        });

        return view;
    }
}