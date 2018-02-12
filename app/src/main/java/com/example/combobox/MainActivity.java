package com.example.combobox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox all, mozarela, sosis, bawang, bakso, ayam, jamur, daging, salad;
    String data, mozarelas, sosiss, bawangs, baksos, ayams, jamurs, dagings, salads;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        all = (CheckBox) findViewById(R.id.all);
        mozarela = (CheckBox) findViewById(R.id.mozarela);
        sosis = (CheckBox) findViewById(R.id.sosis);
        bawang = (CheckBox) findViewById(R.id.bawang);
        bakso = (CheckBox) findViewById(R.id.bakso);
        ayam = (CheckBox) findViewById(R.id.ayam);
        jamur = (CheckBox) findViewById(R.id.jamur);
        daging = (CheckBox) findViewById(R.id.daging);
        salad = (CheckBox) findViewById(R.id.salad);
        text = (TextView) findViewById(R.id.teks);

    }

    public void allCheck(View view) {
        switch (view.getId()) {
            case R.id.all:
                if (all.isChecked()) {
                    mozarela.setChecked(true);
                    sosis.setChecked(true);
                    bawang.setChecked(true);
                    bakso.setChecked(true);
                    ayam.setChecked(true);
                    jamur.setChecked(true);
                    daging.setChecked(true);
                    salad.setChecked(true);
                }
                if (!all.isChecked()) {
                    mozarela.setChecked(false);
                    sosis.setChecked(false);
                    bawang.setChecked(false);
                    bakso.setChecked(false);
                    ayam.setChecked(false);
                    jamur.setChecked(false);
                    daging.setChecked(false);
                    salad.setChecked(false);
                }
        }
    }

    public void allCek(View view) {
        if (mozarela.isChecked() && sosis.isChecked() && bawang.isChecked() && bakso.isChecked() && ayam.isChecked() && jamur.isChecked() && daging.isChecked() && salad.isChecked()) {
            all.setChecked(true);
        } else all.setChecked(false);
    }

    public void onCheckBox(View view) {

        if (mozarela.isChecked()) {
            mozarelas = "Mozarela ";
        }
        if (!mozarela.isChecked()) {
            mozarelas = "";
        }

        if (sosis.isChecked()) {
            sosiss = "Sosis ";
        }
        if (!sosis.isChecked()) {
            sosiss = "";
        }

        if (bawang.isChecked()) {
            bawangs = "Bawang ";
        }
        if (!bawang.isChecked()) {
            bawangs = "";
        }

        if (bakso.isChecked()) {
            baksos = "Bakso ";
        }
        if (!bakso.isChecked()) {
            baksos = "";
        }

        if (ayam.isChecked()) {
            ayams = "Ayam ";
        }
        if (!ayam.isChecked()) {
            ayams = "";
        }

        if (jamur.isChecked()) {
            jamurs = "Jamur ";
        }
        if (!jamur.isChecked()) {
            jamurs = "";
        }

        if (daging.isChecked()) {
            dagings = "Daging ";
        }
        if (!daging.isChecked()) {
            dagings = "";
        }

        if (salad.isChecked()) {
            salads = "Salad ";
        }
        if (!salad.isChecked()) {
            salads = "";
        }

        if (!mozarela.isChecked() && !sosis.isChecked() && !bawang.isChecked() && !bakso.isChecked() && !ayam.isChecked() && !jamur.isChecked() && !daging.isChecked() && !salad.isChecked()) {
            Toast.makeText(MainActivity.this, "Harap pilih minimal 1", Toast.LENGTH_SHORT).show();
            text.setText("-");
        } else {
            data = "Anda memilih Pizza dengan topping : " + mozarelas + sosiss + bawangs + baksos + ayams + jamurs + dagings + salads;
            text.setText(data);
        }
    }

    public void clear(View view) {
        all.setChecked(false);
        mozarela.setChecked(false);
        sosis.setChecked(false);
        bawang.setChecked(false);
        bakso.setChecked(false);
        ayam.setChecked(false);
        jamur.setChecked(false);
        daging.setChecked(false);
        salad.setChecked(false);
        text.setText("");
    }
}
