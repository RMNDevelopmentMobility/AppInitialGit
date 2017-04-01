package ddm.fatec.com.br.appinitialgit;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.R.attr.label;

public class MainActivity extends AppCompatActivity {

    private Context context;
    private Button botaoTuri;
    private Button botaoGabi;
    private Button botaoGui;
    private Button botaoJulio;
    private Button botaoDalfito;
    private Button botaoToniolli;
    private Button botaoMayara;
    private Button botaoSamuel;
    private Button botaoProf;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);

        context = this;

        botaoProf = (Button) findViewById(R.id.btnProf);

        botaoTuri = (Button) findViewById(R.id.btnTuri);
        botaoGabi = (Button) findViewById(R.id.btnGabi);
        botaoGui = (Button) findViewById(R.id.btnGui);
        botaoJulio = (Button) findViewById(R.id.btnJulio);
        botaoDalfito = (Button) findViewById(R.id.btnDalfito);
        botaoToniolli = (Button) findViewById(R.id.btnToniolli);
        botaoMayara = (Button) findViewById(R.id.btnMayara);
        botaoSamuel = (Button) findViewById(R.id.btnSamuel);

        botaoProf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        botaoGabi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent novaTela = new Intent(context, gabiActivity.class);
                startActivity(novaTela);
            }
        });
    }
}
