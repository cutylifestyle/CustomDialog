package com.sixin.dialog;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.StyleRes;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sixin.customdialog.R;

/**
 * @author 周文涛
 */

public class IPDialog extends Dialog {

    private TextView message;

    private Button ok;
    private Button cancel;

    public IPDialog(@NonNull Context context) {

        this(context, 0);

    }

    private IPDialog(@NonNull Context context, @StyleRes int themeResId) {

        super(context, themeResId);

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.dialog_alert);

        initView();

    }

    private void initView() {

        message = (TextView) findViewById(R.id.message);

        ok = (Button) findViewById(R.id.ok);
        cancel = (Button) findViewById(R.id.cancel);

    }

    public void setMessage(String msg){

        message.setText(msg);

    }

    public void setPositionButtonListener(final OkListener listener){

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.ok(v);
            }
        });
    }

    public void setNagtiveListener(final CancelListener listener){

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.cancel(v);
            }
        });

    }

    public interface OkListener{
        void ok(View v);
    }

    public interface CancelListener{
        void cancel(View v);
    }
}
