package com.example.feliperojos.contactos;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ToastTest extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toast_test);
        final TextView text_view = (TextView) findViewById(R.id.textView);
        final EditText edit_text = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        edit_text.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                text_view.setText(s);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        final Context context = getBaseContext();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mostrar = edit_text.getText().toString();
                if(mostrar.equals(""))
                    mostrar="NO HAY TEXTO ESCRITO EN EL EDITTEXT";
                Toast.makeText(context,mostrar, Toast.LENGTH_LONG).show();
            }
        });
    }
}
