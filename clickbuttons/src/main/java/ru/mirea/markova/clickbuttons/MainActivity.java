package ru.mirea.markova.clickbuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView tvOut;
    private Button buttonOk;
    private Button buttonCancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvOut = (TextView) findViewById(R.id.tvOut);
        buttonCancel = (Button) findViewById(R.id.btnCancel);
        buttonOk = (Button) findViewById(R.id.btnOk);

        View.OnClickListener oclBtnOk = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка ОК");
            }
        };

        View.OnClickListener oclBtnCancel = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvOut.setText("Нажата кнопка Cancel");
            }
        };

        buttonOk.setOnClickListener(oclBtnOk);
        buttonCancel.setOnClickListener(oclBtnCancel);
    }
}