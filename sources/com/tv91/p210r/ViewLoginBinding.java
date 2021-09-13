package com.tv91.p210r;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.chip.ninetyonetv.R;
import com.tv91.features.shared.widget.CountdownTextView;
import p010b.p066r.ViewBinding;

/* renamed from: com.tv91.r.j0 */
public final class ViewLoginBinding implements ViewBinding {

    /* renamed from: a */
    private final ConstraintLayout f14420a;

    /* renamed from: b */
    public final Button f14421b;

    /* renamed from: c */
    public final Button f14422c;

    /* renamed from: d */
    public final Button f14423d;

    /* renamed from: e */
    public final Button f14424e;

    /* renamed from: f */
    public final Button f14425f;

    /* renamed from: g */
    public final CountdownTextView f14426g;

    /* renamed from: h */
    public final Guideline f14427h;

    /* renamed from: i */
    public final ImageView f14428i;

    /* renamed from: j */
    public final ImageView f14429j;

    /* renamed from: k */
    public final ConstraintLayout f14430k;

    /* renamed from: l */
    public final TextView f14431l;

    /* renamed from: m */
    public final EditText f14432m;

    /* renamed from: n */
    public final TextView f14433n;

    /* renamed from: o */
    public final EditText f14434o;

    private ViewLoginBinding(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, Button button4, Button button5, CountdownTextView countdownTextView, Guideline guideline, ImageView imageView, ImageView imageView2, ConstraintLayout constraintLayout2, TextView textView, EditText editText, TextView textView2, EditText editText2) {
        this.f14420a = constraintLayout;
        this.f14421b = button;
        this.f14422c = button2;
        this.f14423d = button3;
        this.f14424e = button4;
        this.f14425f = button5;
        this.f14426g = countdownTextView;
        this.f14427h = guideline;
        this.f14428i = imageView;
        this.f14429j = imageView2;
        this.f14430k = constraintLayout2;
        this.f14431l = textView;
        this.f14432m = editText;
        this.f14433n = textView2;
        this.f14434o = editText2;
    }

    /* renamed from: b */
    public static ViewLoginBinding m17740b(View view) {
        View view2 = view;
        int i = R.id.button_login;
        Button button = (Button) view2.findViewById(R.id.button_login);
        if (button != null) {
            i = R.id.button_login_email;
            Button button2 = (Button) view2.findViewById(R.id.button_login_email);
            if (button2 != null) {
                i = R.id.button_login_phone;
                Button button3 = (Button) view2.findViewById(R.id.button_login_phone);
                if (button3 != null) {
                    i = R.id.button_login_quick_register;
                    Button button4 = (Button) view2.findViewById(R.id.button_login_quick_register);
                    if (button4 != null) {
                        i = R.id.button_login_register;
                        Button button5 = (Button) view2.findViewById(R.id.button_login_register);
                        if (button5 != null) {
                            i = R.id.button_login_sms;
                            CountdownTextView countdownTextView = (CountdownTextView) view2.findViewById(R.id.button_login_sms);
                            if (countdownTextView != null) {
                                i = R.id.horizontal_guideline_40_percent;
                                Guideline guideline = (Guideline) view2.findViewById(R.id.horizontal_guideline_40_percent);
                                if (guideline != null) {
                                    i = R.id.image_login_close;
                                    ImageView imageView = (ImageView) view2.findViewById(R.id.image_login_close);
                                    if (imageView != null) {
                                        i = R.id.image_logo;
                                        ImageView imageView2 = (ImageView) view2.findViewById(R.id.image_logo);
                                        if (imageView2 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) view2;
                                            i = R.id.text_forget_password;
                                            TextView textView = (TextView) view2.findViewById(R.id.text_forget_password);
                                            if (textView != null) {
                                                i = R.id.text_login_account;
                                                EditText editText = (EditText) view2.findViewById(R.id.text_login_account);
                                                if (editText != null) {
                                                    i = R.id.text_login_error;
                                                    TextView textView2 = (TextView) view2.findViewById(R.id.text_login_error);
                                                    if (textView2 != null) {
                                                        i = R.id.text_login_password;
                                                        EditText editText2 = (EditText) view2.findViewById(R.id.text_login_password);
                                                        if (editText2 != null) {
                                                            ViewLoginBinding j0Var = new ViewLoginBinding(constraintLayout, button, button2, button3, button4, button5, countdownTextView, guideline, imageView, imageView2, constraintLayout, textView, editText, textView2, editText2);
                                                            return j0Var;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    /* renamed from: c */
    public ConstraintLayout mo5604a() {
        return this.f14420a;
    }
}
