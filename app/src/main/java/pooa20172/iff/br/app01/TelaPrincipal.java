package pooa20172.iff.br.app01;

import android.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaPrincipal extends AppCompatActivity {
    private Button bt_Ok;
    private EditText etNome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tela_principal);
        etNome = (EditText) findViewById(R.id.etNome);
        bt_Ok = (Button) findViewById(R.id.bt_Ok);
        bt_Ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dlg = new AlertDialog.Builder(TelaPrincipal.this);
                dlg.setMessage(etNome.getText().toString());
                dlg.setNeutralButton("OK", null);
                dlg.show();
            }
        });
    }


}
