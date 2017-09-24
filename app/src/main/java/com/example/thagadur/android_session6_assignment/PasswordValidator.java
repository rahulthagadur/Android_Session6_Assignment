package com.example.thagadur.android_session6_assignment;

import android.text.Editable;
import android.text.TextWatcher;

import java.util.regex.Pattern;

/**
 * Created by Thagadur on 9/14/2017.
 */

public class PasswordValidator implements TextWatcher {
    public static final Pattern EMAIL_PATTERN = Pattern.compile(
            "((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})"
    );

    private boolean mIsValid = false;

    public boolean isValid() {
        return mIsValid;
    }


    public static boolean isValidPassword(CharSequence password) {
        return password != null && EMAIL_PATTERN.matcher(password).matches();
    }

    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void afterTextChanged(Editable editableText) {
        mIsValid = isValidPassword(editableText);
    }
}
