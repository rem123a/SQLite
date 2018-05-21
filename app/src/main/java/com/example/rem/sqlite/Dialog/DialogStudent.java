package com.example.rem.sqlite.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import com.example.rem.sqlite.R;

import org.w3c.dom.Text;

public class DialogStudent extends Dialog {
    private Context context;

    private TextView tvCancel, tvYes;
    EditText etName, etDetail;
    RadioButton rbMale, rbFemale;
    private ImageView ivGender;

    public DialogStudent(@NonNull Context context) {
        super(context);
        this.context = context;
    }

    private void initView(){
        tvCancel = this.findViewById(R.id.txtCancel_Dialog);
        tvYes = this.findViewById(R.id.)
    }
}
