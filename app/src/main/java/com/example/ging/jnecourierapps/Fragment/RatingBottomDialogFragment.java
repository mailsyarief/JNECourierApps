package com.example.ging.jnecourierapps.Fragment;

import android.app.Dialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.View;

import com.example.ging.jnecourierapps.R;

public class RatingBottomDialogFragment extends BottomSheetDialogFragment {
    @Override

    public void setupDialog(final Dialog dialog, int style) {
        super.setupDialog(dialog, style);
        View contentView = View.inflate(getContext(), R.layout.bottomsheet_profile_rating, null);
        dialog.setContentView(contentView);
    }
}
